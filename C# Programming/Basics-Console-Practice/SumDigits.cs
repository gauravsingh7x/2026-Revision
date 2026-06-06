using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsolePractice
{
    internal class SumDigits
    {

        internal void sumDigit()
        {
            String dob = "07091996";
            int d = Convert.ToInt32(dob);
            int sum = 0;

            while (d > 0)
            {
                int curr = d % 10;
                sum = sum + curr;
                d = d / 10;
            }
            Console.WriteLine("Sum of Digits " + sum);
        }

    }
}
