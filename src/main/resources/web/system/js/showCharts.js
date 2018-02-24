var showChartsAppmodule = angular.module('showChartsApp', []);

showChartsAppmodule.controller('showChartsController', function($scope, $http, $rootScope, $stateParams, $state) {
	
	////////////////////////////////////////////////////////判断当前页
	$scope.selectItems = [];
    var myChart = null;
    var option = null;
    var qureyDate = null;

	/*//验证登录
	$http({
		method : "POST",
		url : "../adminC/ckLogined",
		//data : loginItems,
	}).success(function(data, status) {
		if (!data.success) {	
			location.href="002_systemLogin.html";
			}
	}).error(function(data, status) {
		$scope.tsText = "遭遇错误";
	});*/
	
	$scope.init = function() {
		if ($state.current.name == 'news') {
		};
		var queryTemp = [{'type':0,'name':'柱状图'},{'type':1,'name':'饼状图'},{'type':2,'name':'折线图'}];
		$scope.selectItems = queryTemp;
		$scope.qureyType = queryTemp[0];
        // $("#appDate").val();
        //赋值，日期的前一天
        $scope.qureyDate = (new Date()).getFullYear() + "-0" + ((new Date()).getUTCMonth() + 1) +  "-" + ((new Date()).getUTCDate()-1) ;
        // $scope.qureyDate = '2017-02-03';
        changeType();

	};

	$scope.init();

	// 重新配置大小
    window.onresize=function(){
        changeType();
    }


    //页面切换图表操作
    $scope.changeType = function() {
        changeType();
    }


    // 执行查询操作
    function changeType() {
        var type = $scope.qureyType.type;
        qureyDate = $scope.qureyDate;
        console.log(qureyDate);
        checkWidth();
        if(type == 0){
            //柱状图
            barLine();
        }else if(type == 1){
            //饼状图
            pie();
        }else if(type == 2){
            line();
        }
        // 使用刚指定的配置项和数据显示图表。
        myChart.setOption(option);
    }

    // 计算页面的宽度等
    function checkWidth(){
        // 基于准备好的dom，初始化echarts实例
        var barline = $("#barLine");
        // 设置宽度大小
        width = document.body.clientWidth
        barline.css("width",width*0.95);
        barline.css("height",450);

        echarts.dispose(barline.get(0))
        myChart = echarts.init(barline.get(0));
        //option重置
        option = null;
    }

    // 柱状图
	function barLine() {
        console.log("切换到柱状图");
        // // 基于准备好的dom，初始化echarts实例
        // var barline = $("#barLine");
        // // 设置宽度大小
        // width = document.body.clientWidth
        // barline.css("width",width);
        // barline.css("height",450);
        //
        // echarts.dispose(barline.get(0))
        // var myChart = echarts.init(barline.get(0));
        checkWidth();

        option = {
            title : {
                text: '店铺销售额',
                subtext: '纯属虚构'
            },
            tooltip : {
                trigger: 'axis'
            },
            legend: {
                data:['一店','二店']
            },
            toolbox: {
                show : true,
                feature : {
                    dataView : {show: true, readOnly: false},
                    // magicType : {show: true, type: ['line', 'bar']},
                    saveAsImage : {show: true}
                }
            },
            calculable : true,
            xAxis : [
                {
                    type : 'category',
                    data : ['1月','2月','3月','4月','5月','6月','7月','8月','9月','10月','11月','12月']
                }
            ],
            yAxis : [
                {
                    type : 'value'
                }
            ],
            series : [
                {
                    name:'一店',
                    type:'bar',
                    data:[2.0, 4.9, 7.0, 23.2, 25.6, 76.7, 135.6, 162.2, 32.6, 20.0, 6.4, 3.3],


                },
                {
                    name:'二店',
                    type:'bar',
                    data:[2.6, 5.9, 9.0, 26.4, 28.7, 70.7, 175.6, 182.2, 48.7, 18.8, 6.0, 2.3],

                }
            ]
        };



    }


    // 饼状图
    function pie() {
        console.log("切换到饼状图");

        option = {
            tooltip: {
                trigger: 'item',
                formatter: "{a} <br/>{b}: {c} ({d}%)"
            },
            legend: {
                orient: 'vertical',
                x: 'left',
                data:['一店','二店','三店','四店','五店']
            },
            toolbox: {
            show : true,
                feature : {
                dataView : {show: true, readOnly: false},
                // magicType : {show: true, type: ['line', 'bar']},
                saveAsImage : {show: true}
            }
            },
            series: [
                {
                    name:'访问来源',
                    type:'pie',
                    radius: ['50%', '70%'],
                    avoidLabelOverlap: false,
                    label: {
                        normal: {
                            show: true
                            // position: 'center'
                        },
                        emphasis: {
                            show: true,
                            textStyle: {
                                fontSize: '30',
                                fontWeight: 'bold'
                            }
                        }
                    },
                    labelLine: {
                        normal: {
                            show: false
                        }
                    },
                    data:[
                        {value:335, name:'一店'},
                        {value:310, name:'二店'},
                        {value:234, name:'三店'},
                        {value:135, name:'四店'},
                        {value:1548, name:'五店'}
                    ]
                }
            ]
        };

    }


    // 折线图
    function line() {
        console.log("切换到折线图");
        option = {
            title: {
                text: '折线图堆叠'
            },
            tooltip: {
                trigger: 'axis'
            },
            legend: {
                data:['一店','二店','三店','四店','五店']
            },
            grid: {
                left: '3%',
                right: '4%',
                bottom: '3%',
                containLabel: true
            },
            toolbox: {
                show : true,
                feature : {
                    dataView : {show: true, readOnly: false},
                    // magicType : {show: true, type: ['line', 'bar']},
                    saveAsImage : {show: true}
                }
            },
            xAxis: {
                type: 'category',
                boundaryGap: false,
                data: ['周一','周二','周三','周四','周五','周六','周日']
            },
            yAxis: {
                type: 'value'
            },
            series: [
                {
                    name:'一店',
                    type:'line',
                    stack: '总量',
                    data:[120, 132, 101, 134, 90, 230, 210]
                },
                {
                    name:'二店',
                    type:'line',
                    stack: '总量',
                    data:[220, 182, 191, 234, 290, 330, 310]
                },
                {
                    name:'三店',
                    type:'line',
                    stack: '总量',
                    data:[150, 232, 201, 154, 190, 330, 410]
                },
                {
                    name:'四店',
                    type:'line',
                    stack: '总量',
                    data:[320, 332, 301, 334, 390, 330, 320]
                },
                {
                    name:'五店',
                    type:'line',
                    stack: '总量',
                    data:[820, 932, 901, 934, 1290, 1330, 1320]
                }
            ]
        };


    }

	
	
	
	$rootScope.logout = function() {
		$http({
			method : "POST",
			url : "../adminC/logout",
		}).success(function(data, status) {
			if (data.success) {	
				location.href="002_systemLogin.html";
			}
		}).error(function(data, status) {
		});
	};

});