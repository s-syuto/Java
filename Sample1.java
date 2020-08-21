//"println"は改行あり

import java.io.*;  //キーボード入力用


class Sample1
{
    public static void main(String[] args)
    {
        System.out.println("ようこそJavaへ！");
        System.out.println("Javaをはじめましょう！");
    }
}

//"print"は改行なし

class Sample2
{
    public static void main(String[] args)
    {
        System.out.print("ようこそJavaへ！");
        System.out.print("Javaをはじめましょう！");
    }
}

/*リテラルについて
    リテラルとは、一定の値を表す単語のようなもの*/


class Sample3
{
    public static void main(String[] args)
    {
        System.out.println('A');
        System.out.println("ようこそJavaへ！");
        System.out.println(123);
    }
}

//変数について

class Sample4
{
    public static void main(String[] args)
    {
        //変数numの宣言
        int num;

        //変数numへの数値の代入
        num = 3;

        System.out.println("変数numの値は" + num + "です。");

    }
}

//変数の変更

class Sample5
{
    public static void main(String[] args)
    {
        int num;
        
        num = 3;

        System.out.println("変数numの値は" + num + "です。");

        //変数に新たな数値の代入
        num = 5;

        System.out.println("変数numの値を変更しました。");
        
        System.out.println("変数numの値は" + num + "です。");

    }
}

//ほかの変数の値を代入する

class Sample6
{
    public static void main(String[] args)
    {
        int num1, num2;

        num1 = 3;

        System.out.println("変数num1の値は" + num1 + "です。");

        //変数num1の値を変数num2に変更します

        num2 = num1;

        System.out.println("変数num1の値を変数num2に代入しました。");

        System.out.println("変数num2の値は" + num2 + "です。");

    }
}

//キーボードからの入力。上確認

class Sample7
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("文字列を入力してください");

        BufferedReader br =
         new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        System.out.println(str + "が入力されました。");
    }
}

//数値を入力する

class Sample8
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("整数を入力してください。");
        
        BufferedReader br =
         new BufferedReader(new InputStreamReader(System.in));
        
        String str = br.readLine();
        /* "double num = Double.parseDouble(str)"と記述することにより、文字列をdouble型の変数にして読み込む*/
        int num = Integer.parseInt(str);

        System.out.println(num + "が入力されました。");
    }
}

//複数の数値を入力する

class Sample9
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("整数を２つ入力してください。");

        BufferedReader br = 
         new BufferedReader(new InputStreamReader(System.in));
        
        String str1 = br.readLine();
        String str2 = br.readLine();

        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);

        System.out.println("最初に" + num1 + "が入力されました。");
        System.out.println("次に" + num2 + "が入力されました。");
    }
}

//式の値を入力する

class Sample10
{
    public static void main(String[] args)
    {
        /* 演算するものを"演算子",演算の対象を"オペラント"と言う */
        System.out.println("1+2は" + (1+2) + "です。");
        System.out.println("3*4は" + (3*4) + "です。");
    }
}

//いろんな演算

class Sample11
{
    public static void main(String[] args)
    {
        int num1 = 2;
        int num2 = 3;
        int sum = num1+num2;

        System.out.println("変数num1の値は" + num1 + "です。");
        System.out.println("変数num2の値は" + num2 + "です。");
        System.out.println("num1+num2の値は" + sum + "です。");

        num1 = num1+1;

        System.out.println("変数num1の値に１たすと" + num1 + "です。");
    }
}

//キーボードから入力した値を足し算する。

class Sample12
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("整数を２つ入力してください。");

        BufferedReader br =
         new BufferedReader(new InputStreamReader(System.in));
        
        String str1 = br.readLine();
        System.out.println("2つ目の整数を入力してください");
        String str2 = br.readLine();
        
        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);

        System.out.println("足し算の結果は" + (num1+num2) + "です。");
    }
}

//様々な演算子の利用

class Sample13

{
    public static void main(String[] args)
    {
        int num1 = 10;
        int num2 = 5;

        System.out.println("num1とnum2に様々な演算を行います。");
        System.out.println("num1+num2は" + (num1+num2) + "です。");
        System.out.println("num1-num2は" + (num1-num2) + "です。");
        System.out.println("num1*num2は" + (num1*num2) + "です。");
        System.out.println("num1/num2は" + (num1/num2) + "です。");
        System.out.println("num1%num2は" + (num1%num2) + "です。");
    }
}

//複合的な代入演算子を使う

class Sample14
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("整数を３つ入力してください。");

        BufferedReader br =
         new BufferedReader(new InputStreamReader(System.in));
        
        String str1 = br.readLine();
        System.out.println("2つ目の整数を入力してください。");
        String str2 = br.readLine();
        System.out.println("3つ目の指数を入力してください。");
        String str3 = br.readLine();

        int sum = 0;
        sum += Integer.parseInt(str1);
        sum += Integer.parseInt(str2);
        sum += Integer.parseInt(str3);

        System.out.println("3つの数の合計は" + sum + "です。");

    }
}


//かっこの有無

class Sample15
{
    public static void main(String[] args) 
    {
        System.out.println("1+2は" + 1+2 + "です。");
        //かっこをつけないと文字列として認識される

        System.out.println("3*4は" + 3*4 + "です。");
    }
}

//大きなサイズの型に代入する

class Sample16
{
    public static void main(String[] args)
    {
        int inum = 160;

        System.out.println("身長は" + inum + "センチです。");

        System.out.println("double型の変数に代入します。");
        double dnum = inum;

        System.out.println("身長は" + dnum + "センチです。");
    }
}

//小さなサイズの型に代入する

class Sample17
{
    public static void main(String[] args)
    {
        double dnum = 160.5;

        System.out.println("身長は" + dnum + "センチです。");

        System.out.println("int?^?????????????");
        //int inum = dnum; と記述するとエラーがでる
        int inum = (int)dnum; //この型の式はキャスト演算子と呼ぶ

        System.out.println("身長は" + inum + "センチです。");
    }
}

//異なる型同士での演算

class Sample18
{
    public static void main(String[] args)
    {
        int d = 2;
        double pi = 3.14;

        System.out.println("直径が" + d + "センチの円の");
        System.out.println("円周は" + (d*pi) + "センチです。");
    }
}

//同じ型同士での演算

class Sample19
{
    public static void main(String[] args)
    {
        int num1 = 5;
        int num2 = 4;

        // double div = num1 / num2; この記述はエラー吐かれる
        double div = (double)num1 / (double)num2;

        System.out.println("5/4は" + div + "です。");
    }
}


//

