using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsolePractice
{
    internal class SimpleIntrest
    {
        float p, r, t, si;
        internal void clacSI() {
            p = 120000;
            r = 2.2F;
            t = 4.5F;
            si = (p * r * t)/100;
            Console.WriteLine("Simple Intrest is {0}",si);
        }
    }
}
