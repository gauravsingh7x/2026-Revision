using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsolePractice
{
    internal class BoxingExample
    {
        internal void boxingFun()
        {
            int a = 10;
            Object obj;
            obj = a;
            Console.WriteLine("boxing > value into object "+obj);
        }

        internal void unboxingFun()
        {
            object obj = 10;
            //have to typecast to store in value_type from reference_type (jo ek object hai) 
            int a = (int)obj;
            Console.WriteLine("unboxing > object to value type "+a);

        }
    }
}
