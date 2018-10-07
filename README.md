# software_test_hotel_world_clock_0148
软件测试与验证 week2-3报告 10152140148
<br>
## “码农酒店”世界时钟系统 需求列表 ##
• REQ1: ”码农酒店”大堂里有5个时钟，分别显示北京、伦敦、莫斯科、悉尼和纽约的时间<br>
• REQ2: 伦敦与UTC时间一致，北京比UTC时间早8小时，莫斯科比UTC时间早4小时，悉尼比UTC时间早10小时，纽约比UTC时间晚5小时<br>
• REQ3: 将酒店大堂服务员的智能手机时间设置为北京时间<br>
• REQ4: 若大堂墙壁上所有城市的时钟都或多或少有些走时不准，需要调整时间时，只需调准服务员手机的时间，那么墙上5个城市的时钟时间都能够相应地自动调整准确
<br><br>

## 静态代码检查 
### 使用阿里巴巴P3C插件进行代码静态分析
#### 编码规约扫描，检测到抽象方法命名不规范
![](https://raw.githubusercontent.com/ZillaRU/software_test_hotel_world_clock_0148/master/PrtSc_img/IMG_20181003_101209.jpg)
#### 编码规约扫描，检测到抽象方法未用javadoc注释
![](https://raw.githubusercontent.com/ZillaRU/software_test_hotel_world_clock_0148/master/PrtSc_img/IMG_20181003_101132.jpg)
<br><br>
## 基于JUnit4验证happy path的测试代码
#### 在IDEA中配置了JUnit Generator，自动生成测试代码的基本结构，组织测试代码使用了parallel source tree，避免与被测代码混淆在一起。
![](https://raw.githubusercontent.com/ZillaRU/software_test_hotel_world_clock_0148/master/PrtSc_img/file_tree.png)
#### 设置test resource root
![](https://raw.githubusercontent.com/ZillaRU/software_test_hotel_world_clock_0148/master/PrtSc_img/set_test_root.png)
#### 检测到对象可能未初始化，产生空指针
![](https://raw.githubusercontent.com/ZillaRU/software_test_hotel_world_clock_0148/master/PrtSc_img/IMG_20181003_101116.jpg)
#### 补充针对对象未初始化的处理，通过全部测试
![](https://raw.githubusercontent.com/ZillaRU/software_test_hotel_world_clock_0148/master/PrtSc_img/IMG_20181003_101100.jpg)
