using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsolePractice
{
    internal class LeapYear
    {
        internal void leapYear()
        {
            int year = 2024;
            string res = ((year % 4 == 0 && year % 100 != 0) || year%400 == 0) ? "leap year" : "not leap year";
            Console.WriteLine(res);
        }

    }
}
