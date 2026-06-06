using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsolePractice
{
    internal class DataTypes
    {
        internal void primitiveDataTypeFun()
        {

            int a = 25;     //4 byte
            float b = 23.45F;   //4 byte
            double c = 2456.5;  //8 byte
            bool d = false;     //1 byte
            char ch = 'a';      //2 byte
            string str = "hello"; //primitive string
            byte bt = 2;    //1 byte

            Console.WriteLine("primitive_data_types > a={0}, b={1}, c={2}, d={3}, ch={4}, str={5}, bt={6}", a , b , c , d , ch , str , bt );

        }


        internal void derivedDataTypeFun()
        {
            Int16 a = 10;     //2 byte
            float b = 23.45F;   //4 byte
            Double c = 2456.5;  //8 byte
            Boolean d = false;     //1 byte
            Char ch = 'a';      //2 byte
            String str = "hello"; //
            Byte bt = 2;    //1 byte

            Console.WriteLine("derived_data_types > a={0}, b={1}, c={2}, d={3}, ch={4}, str={5}, bt={6}", a, b, c, d, ch, str, bt);

        }
    }
}
