<%@ page 	language="java" 
			contentType="text/html; charset=UTF-8"
    		pageEncoding="UTF-8"
    		deferredSyntaxAllowedAsLiteral="true"
    		%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

	<link rel="stylesheet" 	href="${pageContext.request.contextPath}/plug/lte/bower_components/bootstrap/dist/css/bootstrap.min.css">
	<link rel="stylesheet" 	href="${pageContext.request.contextPath}/plug/lte/bower_components/font-awesome/css/font-awesome.min.css">
	<link rel="stylesheet" 	href="${pageContext.request.contextPath}/plug/lte/bower_components/Ionicons/css/ionicons.min.css">
	<link rel="stylesheet" 	href="${pageContext.request.contextPath}/plug/lte/dist/css/AdminLTE.min.css">
	<link rel="stylesheet" 	href="${pageContext.request.contextPath}/plug/lte/dist/css/skins/_all-skins.min.css">
<script type="text/javascript" src="${pageContext.request.contextPath}/plug/js/echarts.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/plug/js/echarts.min.js"></script>
	
	

	<div class="row">
      	
      	
        <div class="col-lg-3 col-xs-6">
          <!-- small box -->
          <div class="small-box bg-aqua">
            <div class="inner">
              <h3>247</h3>
              <p>月单量</p>
            </div>
            <div class="icon">
              <i class="ion ion-bag"></i>
            </div>
            <a href="#" class="small-box-footer">&nbsp;</a>
          </div>
        </div>
        <!-- ./col -->
        
        
        <div class="col-lg-3 col-xs-6">
          <!-- small box -->
          <div class="small-box bg-green">
            <div class="inner">
              <h3>53</h3>
              <p>本日访客</p>
            </div>
            <div class="icon">
              <i class="ion ion-stats-bars"></i>
            </div>
            <a href="#" class="small-box-footer">&nbsp;</a>
          </div>
        </div>
        <!-- ./col -->
        
        
        <div class="col-lg-3 col-xs-6">
          <!-- small box -->
          <div class="small-box bg-yellow">
            <div class="inner">
              <h3>21</h3>
              <p>新增用户</p>
            </div>
            <div class="icon">
              <i class="ion ion-person-add"></i>
            </div>
            <a href="#" class="small-box-footer">&nbsp;</a>
          </div>
        </div>
        <!-- ./col -->
        
        
        <div class="col-lg-3 col-xs-6">
          <!-- small box -->
          <div class="small-box bg-red">
            <div class="inner">
              <h3>85<sup style="font-size: 20px">%</sup></h3>
              <p>顾客满意率</p>
            </div>
            <div class="icon">
              <i class="ion ion-pie-graph"></i>
            </div>
            <a href="#" class="small-box-footer">&nbsp;</a>
          </div>
        </div>
        <!-- ./col -->
        
        <div class="row">
        
        </div>
</div>

<div style="height: auto;">
	<div  style="width:500px;height:500px;top: 40px; left:10px" id="xdd">
		
		<script type="text/javascript">
		var myChart = echarts.init(document.getElementById("xdd"));
		option = {
			    title : {
			    	fontSize:20,
			        text: '2019上半年度收入统计',
			        textStyle:{
			            fontSize:15,
			        }
			       
			    },
			    tooltip : {
			        trigger: 'axis'
			    },
			    legend: {
			        data:['毛利润/万','纯利润/万']
			    },
			    toolbox: {
			        show : true,
			        feature : {
			            dataView : {show: true, readOnly: false},
			            magicType : {show: true, type: ['line', 'bar']},
			            restore : {show: true},
			            saveAsImage : {show: true}
			        }
			    },
			    calculable : true,
			    xAxis : [
			        {
			            type : 'category',
			            data : ['1月','2月','3月','4月','5月','6月']
			        }
			    ],
			    yAxis : [
			        {
			            type : 'value'
			        }
			    ],
			    series : [
			        {
			            name:'毛利润/万',
			            type:'bar',
			            data:[200.0, 400.9, 700.0, 230.2, 250.6, 760.7,],
			            markPoint : {
			                data : [
			                    {type : 'max', name: '最大值'},
			                    {type : 'min', name: '最小值'}
			                ]
			            },
			            markLine : {
			                data : [
			                    {type : 'average', name: '平均值'}
			                ]
			            }
			        },
			        {
			            name:'纯利润/万',
			            type:'bar',
			            data:[20.6, 50.9, 90.0, 26.4, 28.7, 70.7, ],
			            markPoint : {
			                data : [
			                    {name : '年最高', value : 182.2, xAxis: 7, yAxis: 183},
			                    {name : '年最低', value : 2.3, xAxis: 11, yAxis: 3}
			                ]
			            },
			            markLine : {
			                data : [
			                    {type : 'average', name : '平均值'}
			                ]
			            }
			        }
			    ]
			};
		myChart.setOption(option);
</script>
	</div>
	<div style="position:relative; width:600px;height:500px;left: 630px; top: -420px;" id="xdd2">
		
		<script type="text/javascript">
		var myChart = echarts.init(document.getElementById("xdd2"));
option = {
		tooltip: {
			trigger: 'item',
			formatter:"{a} <br/>{b}: {c} ({d}%)"
    },
    legend: {
        orient: 'vertical',
        x: 'left',
        data:['东部地区','中部地区','西部地区',]
    },
    series: [
        {
            name:'接收快件分布',
            type:'pie',
            selectedMode: 'single',
            radius: [0, '20%'],

            label: {
                normal: {
                    position: 'inner'
                }
            },
            labelLine: {
                normal: {
                    show: false
                }
            },
            data:[
                {value:335, name:'西部地区', selected:true},
                {value:679, name:'中部地区'},
                {value:1548, name:'东部地区'}
            ]
        },
        {
            name:'发送快件分布',
            type:'pie',
            radius: ['25%', '35%'],
            label: {
                normal: {
                    formatter: '{a|{a}}{abg|}\n{hr|}\n  {b|{b}：}{c}  {per|{d}%}  ',
                    backgroundColor: '#eee',
                    borderColor: '#aaa',
                    borderWidth: 1,
                    borderRadius: 4,
                    // shadowBlur:3,
                    // shadowOffsetX: 2,
                    // shadowOffsetY: 2,
                    // shadowColor: '#999',
                    // padding: [0, 7],
                    rich: {
                        a: {
                            color: '#999',
                            lineHeight: 22,
                            align: 'center'
                        },
                        // abg: {
                        //     backgroundColor: '#333',
                        //     width: '100%',
                        //     align: 'right',
                        //     height: 22,
                        //     borderRadius: [4, 4, 0, 0]
                        // },
                        hr: {
                            borderColor: '#aaa',
                            width: '100%',
                            borderWidth: 0.5,
                            height: 0
                        },
                        b: {
                            fontSize: 16,
                            lineHeight: 33
                        },
                        per: {
                            color: '#eee',
                            backgroundColor: '#334455',
                            padding: [2, 4],
                            borderRadius: 2
                        }
                    }
                }
            },
            data:[
                {value:335, name:'中部地区'},
                {value:135, name:'西部地区'},
                {value:1048, name:'东部地区'}                
            ]
        }
    ]
};
		myChart.setOption(option);
</script>
	</div>
	
	
</div>
</div>