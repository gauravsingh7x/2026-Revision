using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsolePractice
{
    internal class Var
    {
        
        
        internal void DynamI()  //instance Or dynamic fun
        {
            int y = 10; //instance OR dynamic
            Console.WriteLine("Instance from Var class called by object "+y);
        }
        internal static void stat()
        {
            int x = 100;    //static due static fun, 
            Console.WriteLine("Static variable from Var class called by Classname "+x);
        }
    }
}
