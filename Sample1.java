//"println"�͉��s����

import java.io.*;  //�L�[�{�[�h���͗p


class Sample1
{
    public static void main(String[] args)
    {
        System.out.println("�悤����Java�ցI");
        System.out.println("Java���͂��߂܂��傤�I");
    }
}

//"print"�͉��s�Ȃ�

class Sample2
{
    public static void main(String[] args)
    {
        System.out.print("�悤����Java�ցI");
        System.out.print("Java���͂��߂܂��傤�I");
    }
}

/*���e�����ɂ���
    ���e�����Ƃ́A���̒l��\���P��̂悤�Ȃ���*/


class Sample3
{
    public static void main(String[] args)
    {
        System.out.println('A');
        System.out.println("�悤����Java�ցI");
        System.out.println(123);
    }
}

//�ϐ��ɂ���

class Sample4
{
    public static void main(String[] args)
    {
        //�ϐ�num�̐錾
        int num;

        //�ϐ�num�ւ̐��l�̑��
        num = 3;

        System.out.println("�ϐ�num�̒l��" + num + "�ł��B");

    }
}

//�ϐ��̕ύX

class Sample5
{
    public static void main(String[] args)
    {
        int num;
        
        num = 3;

        System.out.println("�ϐ�num�̒l��" + num + "�ł��B");

        //�ϐ��ɐV���Ȑ��l�̑��
        num = 5;

        System.out.println("�ϐ�num�̒l��ύX���܂����B");
        
        System.out.println("�ϐ�num�̒l��" + num + "�ł��B");

    }
}

//�ق��̕ϐ��̒l��������

class Sample6
{
    public static void main(String[] args)
    {
        int num1, num2;

        num1 = 3;

        System.out.println("�ϐ�num1�̒l��" + num1 + "�ł��B");

        //�ϐ�num1�̒l��ϐ�num2�ɕύX���܂�

        num2 = num1;

        System.out.println("�ϐ�num1�̒l��ϐ�num2�ɑ�����܂����B");

        System.out.println("�ϐ�num2�̒l��" + num2 + "�ł��B");

    }
}

//�L�[�{�[�h����̓��́B��m�F

class Sample7
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("���������͂��Ă�������");

        BufferedReader br =
         new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        System.out.println(str + "�����͂���܂����B");
    }
}

//���l����͂���

class Sample8
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("��������͂��Ă��������B");
        
        BufferedReader br =
         new BufferedReader(new InputStreamReader(System.in));
        
        String str = br.readLine();
        /* "double num = Double.parseDouble(str)"�ƋL�q���邱�Ƃɂ��A�������double�^�̕ϐ��ɂ��ēǂݍ���*/
        int num = Integer.parseInt(str);

        System.out.println(num + "�����͂���܂����B");
    }
}

//�����̐��l����͂���

class Sample9
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("�������Q���͂��Ă��������B");

        BufferedReader br = 
         new BufferedReader(new InputStreamReader(System.in));
        
        String str1 = br.readLine();
        String str2 = br.readLine();

        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);

        System.out.println("�ŏ���" + num1 + "�����͂���܂����B");
        System.out.println("����" + num2 + "�����͂���܂����B");
    }
}

//���̒l����͂���

class Sample10
{
    public static void main(String[] args)
    {
        /* ���Z������̂�"���Z�q",���Z�̑Ώۂ�"�I�y�����g"�ƌ��� */
        System.out.println("1+2��" + (1+2) + "�ł��B");
        System.out.println("3*4��" + (3*4) + "�ł��B");
    }
}

//�����ȉ��Z

class Sample11
{
    public static void main(String[] args)
    {
        int num1 = 2;
        int num2 = 3;
        int sum = num1+num2;

        System.out.println("�ϐ�num1�̒l��" + num1 + "�ł��B");
        System.out.println("�ϐ�num2�̒l��" + num2 + "�ł��B");
        System.out.println("num1+num2�̒l��" + sum + "�ł��B");

        num1 = num1+1;

        System.out.println("�ϐ�num1�̒l�ɂP������" + num1 + "�ł��B");
    }
}

//�L�[�{�[�h������͂����l�𑫂��Z����B

class Sample12
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("�������Q���͂��Ă��������B");

        BufferedReader br =
         new BufferedReader(new InputStreamReader(System.in));
        
        String str1 = br.readLine();
        System.out.println("2�ڂ̐�������͂��Ă�������");
        String str2 = br.readLine();
        
        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);

        System.out.println("�����Z�̌��ʂ�" + (num1+num2) + "�ł��B");
    }
}

//�l�X�ȉ��Z�q�̗��p

class Sample13

{
    public static void main(String[] args)
    {
        int num1 = 10;
        int num2 = 5;

        System.out.println("num1��num2�ɗl�X�ȉ��Z���s���܂��B");
        System.out.println("num1+num2��" + (num1+num2) + "�ł��B");
        System.out.println("num1-num2��" + (num1-num2) + "�ł��B");
        System.out.println("num1*num2��" + (num1*num2) + "�ł��B");
        System.out.println("num1/num2��" + (num1/num2) + "�ł��B");
        System.out.println("num1%num2��" + (num1%num2) + "�ł��B");
    }
}

//�����I�ȑ�����Z�q���g��

class Sample14
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("�������R���͂��Ă��������B");

        BufferedReader br =
         new BufferedReader(new InputStreamReader(System.in));
        
        String str1 = br.readLine();
        System.out.println("2�ڂ̐�������͂��Ă��������B");
        String str2 = br.readLine();
        System.out.println("3�ڂ̎w������͂��Ă��������B");
        String str3 = br.readLine();

        int sum = 0;
        sum += Integer.parseInt(str1);
        sum += Integer.parseInt(str2);
        sum += Integer.parseInt(str3);

        System.out.println("3�̐��̍��v��" + sum + "�ł��B");

    }
}


//�������̗L��

class Sample15
{
    public static void main(String[] args) 
    {
        System.out.println("1+2��" + 1+2 + "�ł��B");
        //�����������Ȃ��ƕ�����Ƃ��ĔF�������

        System.out.println("3*4��" + 3*4 + "�ł��B");
    }
}

//�傫�ȃT�C�Y�̌^�ɑ������

class Sample16
{
    public static void main(String[] args)
    {
        int inum = 160;

        System.out.println("�g����" + inum + "�Z���`�ł��B");

        System.out.println("double�^�̕ϐ��ɑ�����܂��B");
        double dnum = inum;

        System.out.println("�g����" + dnum + "�Z���`�ł��B");
    }
}

//�����ȃT�C�Y�̌^�ɑ������

class Sample17
{
    public static void main(String[] args)
    {
        double dnum = 160.5;

        System.out.println("�g����" + dnum + "�Z���`�ł��B");

        System.out.println("int?^?????????????");
        //int inum = dnum; �ƋL�q����ƃG���[���ł�
        int inum = (int)dnum; //���̌^�̎��̓L���X�g���Z�q�ƌĂ�

        System.out.println("�g����" + inum + "�Z���`�ł��B");
    }
}

//�قȂ�^���m�ł̉��Z

class Sample18
{
    public static void main(String[] args)
    {
        int d = 2;
        double pi = 3.14;

        System.out.println("���a��" + d + "�Z���`�̉~��");
        System.out.println("�~����" + (d*pi) + "�Z���`�ł��B");
    }
}

//�����^���m�ł̉��Z

class Sample19
{
    public static void main(String[] args)
    {
        int num1 = 5;
        int num2 = 4;

        // double div = num1 / num2; ���̋L�q�̓G���[�f�����
        double div = (double)num1 / (double)num2;

        System.out.println("5/4��" + div + "�ł��B");
    }
}


//

