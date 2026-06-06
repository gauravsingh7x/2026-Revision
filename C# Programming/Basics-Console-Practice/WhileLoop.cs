using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsolePractice
{
    internal class WhileLoop
    {
        //WAP to reverse number 
        internal void WhileLooping()
        {
            int num = 216463252;
            String str = "";
            while (num != 0)
            {
                str = str + num%10;
                num = num / 10;
            }
            Console.WriteLine("Reverse number is "+str);
        }
    }
}
