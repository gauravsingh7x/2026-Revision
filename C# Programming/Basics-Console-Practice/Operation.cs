using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsolePractice
{
    internal class Operation
    {
        int a, b, c;
        internal void Accept()
        {
            Console.WriteLine("Enter first number: ");
            a = Convert.ToInt32(Console.ReadLine());

            Console.WriteLine("Enter second number: ");
            b = Convert.ToInt32(Console.ReadLine());
        }
        internal void Add()
        {
            c = a + b;
            Console.WriteLine("Sum " + c);
        }
        internal void Sub()
        {
            c = a - b;
            Console.WriteLine("Sub " + c);
        }
        internal void Multi()
        {
            c = a * b;
            Console.WriteLine("Multi " + c);
        }
        internal void Divi()
        {
            c = a / b;
            Console.WriteLine("Div " + c);
        }

    }
}
