// See https://aka.ms/new-console-template for more information

using ConsolePractice;
using System;
using System.Reflection.Metadata.Ecma335;
class Program
{



    static int g_s_V = 10;  //global static
    int i_d_V = 200;        //global instance OR dynamic
    public static void Main(string[] args)
    {

        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.DyArray();


        StaticArray staticArray = new StaticArray();
        staticArray.StaticArr();


        Dec2Bin decbin = new Dec2Bin();
        decbin.Decimal2Binary();


        Bin2Dec bindec = new Bin2Dec();
        bindec.Binary2Decimal();


        NestedLoop nest = new NestedLoop();
        nest.Nesting();


        WhileLoop rev = new WhileLoop();
        rev.WhileLooping();


        FactorialNum fact = new FactorialNum();
        fact.FactorialNumber();


        Table table = new Table();
        table.TableExample();


        Vowel vexample =new Vowel();
        vexample.vowelExample();


        LeapYear leapExample = new LeapYear();
        leapExample.leapYear();

        SumDigits summ = new SumDigits();
        summ.sumDigit();

        DateDiff diff = new DateDiff();
        diff.DateDiffer();


        DataTypes dt = new DataTypes();
        dt.primitiveDataTypeFun();
        dt.derivedDataTypeFun();


        BoxingExample example = new BoxingExample();
        example.boxingFun();
        example.unboxingFun();


        //swap2numbers using static global varibale
        SwapNumber.Swap();

        //Global Var vs Local Var
        int s_V = 10;
        s_V = 100;
        Console.WriteLine("s_V is static variable " + s_V);
        Console.WriteLine("g_s_V is the Global Static Variable called by Classname " + Program.g_s_V);
        Program obj = new Program();
        Console.WriteLine("i_d_V is Global Instance Variable called by Object " + obj.i_d_V);

        //object creation to call instance/dynamicFun/var
        Var obj1 = new Var();
        obj1.DynamI();
        //we create memory for by object creation at runtime for non-static fun/var

        //classname due to call static fun/method/var
        Var.stat();
        //memory allocated at compiletime


        //SimpleIntrest smpl = new SimpleIntrest();
        //smpl.clacSI();


        //Operation obj = new Operation();
        //obj.Accept();
        //obj.Add();
        //obj.Sub();
        //obj.Multi();
        //obj.Divi();


    }

}

