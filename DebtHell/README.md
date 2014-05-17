# 問題URL
- http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=0007&lang=jp

# ポイント
1000円未満切り上げのところがわからず、結局検索に頼ってしまった。
この１行が切り上げのための処理。

```java
debt = (int)Math.ceil((double)debt / 1000) * 1000;
```

Math.ceilでの切り上げは少数に対して行うものなので、対象となるdebtをdouble型でキャストしてから1000で割っている。
たとえばdebtが127627だったら、12.7627となる。そしてそれをMath.ceilで13.0にして、intでキャストして13、さらに1000を掛けて130000にしている。

ところで、「ヤミ金」が英語だと「loan shark」というのも勉強になった。
