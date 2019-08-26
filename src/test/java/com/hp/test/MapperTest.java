package com.hp.test;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.hp.bean.Access_records;
import com.hp.bean.Account_num;
import com.hp.bean.Notice;
import com.hp.bean.Post;
import com.hp.bean.Stock;
import com.hp.bean.User;
import com.hp.dao.Account_numDao;
import com.hp.dao.Account_numMapper;
import com.hp.dao.NoticeMapper;
import com.hp.dao.StockDao;
import com.hp.dao.UserDao;
import com.hp.service.Access_recordsService;
import com.hp.service.PostService;
import com.hp.service.StockSservice;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring-context.xml"})
public class MapperTest {

	@Autowired
	Account_numMapper account_numMapper;
	@Autowired
	UserDao userdao;	
	@Autowired
	NoticeMapper noticeMapper;
	@Autowired
	Account_numDao account_numDao;
	@Autowired
	Access_recordsService access_recordsService;
	@Autowired
	StockSservice stockService;
	@Autowired
	PostService postService;
	
	@Test
	public void test() {
//		Account_num account_num = new Account_num();
//		account_num.setAccNo(3);
////		account_num.setAccNum("courier");
////		account_num.setAccPwd("courier");
////		account_num.setAccState(null);
////		account_numMapper.insertSelective(account_num);
//		account_numMapper.deleteByPrimaryKey(account_num.getAccNo());
		
		Account_num account_num = new Account_num();
		account_num.setAccNum("admin");
		String adminString = account_num.getAccNum();
		List<Account_num> account_nums = account_numDao.queryAllAccNum();
		for(int i=0;i<account_nums.size();i++) {
			System.out.println(account_nums.get(i).getAccNum());
//			if(account_nums.contains()) {
//			
//				System.out.println("333");
//				break;
//				
//				
//			}else {
//			System.out.println("333232");
//			}	
		}
	}
	
	@Test
	public void test2() {
		Access_records access_records = new Access_records();
		access_records.setPoNo(2);
		//查询送出记录
		Post post = new Post();
		post.setPoNo(access_records.getPoNo());
		post = postService.selectByPrimaryKey(post.getPoNo());
		Stock stock = new Stock();
		List<String> strList = new ArrayList<String>();
		List<Access_records> list = access_recordsService.queryAccessrecordsByPono(access_records);
		
		if (post.getPoStarTime()!=null) {
			java.sql.Timestamp StartDate = new java.sql.Timestamp(post.getPoStarTime().getTime());
			strList.add("我们已收到您的包裹，将于 "+StartDate+" 从 "+post.getPoStarAddress()+"送出。");
			
			for(Access_records a:list ) {
				stock.setStockNum(a.getStockNum());
				stock = stockService.queryAllStocksByStockNum(stock);
				if (a.getAccStartTime()!=null) {
					java.sql.Timestamp InDate = new java.sql.Timestamp(a.getAccStartTime().getTime());
					a.setStrIn(InDate+"时 ，到达 "+stock.getStockName()+" 。");
					strList.add(a.getStrIn());
				}
				if (a.getAccEndTime()!=null) {
					java.sql.Timestamp OutDate = new java.sql.Timestamp(a.getAccEndTime().getTime());
					a.setStrOut(OutDate+"时 ，已从 "+stock.getStockName()+" 发出。");
					strList.add(a.getStrOut());
				}
			}
			
			if (post.getPoEndTime()!=null) {
				java.sql.Timestamp EndDate = new java.sql.Timestamp(post.getPoStarTime().getTime());
				strList.add(EndDate+" ，包裹已送达至 "+post.getPoEndAddress()+" 感谢您选择天软物流。");
			}
			
		}else {
			System.out.println("该订单暂无快递信息");
		}
		//查询仓库记录
		
		
		
		for(String str:strList) {
			System.out.println(str);
		}
	
	}
	
}
