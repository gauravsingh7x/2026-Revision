using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsolePractice
{
    internal class DateDiff
    {
        //WAP to calc the difference of two dates in the year, a date should be assigned on DDMMYYYY

        internal void DateDiffer() { 

        String date1 = "30052026";
        String date2 = "13062019";

        int d1 = Convert.ToInt32(date1);
        int d2 = Convert.ToInt32(date2);

        int y1 = d1 % 10000;  //2016
        int y2 = d2 % 10000;  //2019

        Console.WriteLine("year1 "+ y1);
        Console.WriteLine("year2 "+ y2);
        Console.WriteLine("difference "+ (y1-y2));

        }
    }
}
