# RuleView
 This Library is based on https://github.com/zjun615/RulerView.

## 一、效果图
> 全部效果:

![allGif](https://github.com/zjun615/RuleView/blob/master/img/all.gif)

> RuleView:

![ruleGif](https://github.com/zjun615/RuleView/blob/master/img/ruleView.gif)

> MoneySelectRuleView:

![moneyGif](https://github.com/zjun615/RuleView/blob/master/img/money.gif)

> TimeRuleView:

![timeGif](https://github.com/zjun615/RuleView/blob/master/img/time.gif)


 

### 1. RuleView
 
For weight and Height Calculation. I had modified the library. 
 

`implementation 'com.zjun:rule-view:0.0.1'`
 
 
 
 ```xml
<com.zjun.widget.RuleView
    android:layout_width="match_parent"
    android:layout_height="70dp"
    app:zjun_textSize="18sp" />
  
<com.zjun.widget.MoneySelectRuleView
    android:layout_width="match_parent"
    android:layout_height="wrap_content" />
  
<com.zjun.widget.TimeRuleView
    android:layout_width="match_parent"
    android:layout_height="wrap_content" />
 ```
 
### 4.2 监听回调
 
主要用来监听当前数值的变化
 ```java
ruleView.setOnValueChangedListener(new RuleView.OnValueChangedListener() {
    @Override
    public void onValueChanged(float value) {
        tvValue.setText(Float.toString(value));
    }
});
  
  ```
 

## 五、属性说明
 
### 5.1 RuleView属性
 
属性名 | 说明 | 默认值
:------ | :------ | :------
zjun_bgColor | 背景颜色 | #f5f8f5
zjun_gradationColor | 刻度颜色 | Color.LTGRAY(#CCCCCC)
gv_shortLineWidth | 短刻度线的宽度 | 1dp
gv_shortGradationLen | 短刻度长度 | 16dp
gv_longGradationLen | 长刻度长度 | gv_shortGradationLen * 2
gv_longLineWidth | 长刻度线的宽度 | gv_shortLineWidth * 2
zjun_textColor | 刻度值字体颜色 | Color.BLACK，#000000
zjun_textSize | 刻度值字体大小 | 14sp
zjun_indicatorLineColor | 中间指针线的颜色 | #48b975
zjun_indicatorLineWidth | 中间指针线的宽度 | 3dp
gv_indicatorLineLen | 中间指针线的长度 | 35dp
gv_minValue | 最小值 | 0f
gv_maxValue | 最大值 | 100f
gv_currentValue | 当前值 | 50f
gv_gradationUnit | 刻度间最小单位数值 | .1f
gv_numberPerCount | 两数值间最小单位的个数 | 10
gv_gradationGap | 最小单位的间距 | 10dp
gv_gradationNumberGap | 数值与最长刻度的间距 | 8dp

 
 

经过网友提醒，才发现单词 Rule 写错了，尴尬了⁄(⁄ ⁄•⁄ω⁄•⁄ ⁄)⁄。现更改 GitHub 项目名为 RulerView，其它不便修改，保持不变。

## 八、LICENSE
```
Copyright (c) 2018 Ralap

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
