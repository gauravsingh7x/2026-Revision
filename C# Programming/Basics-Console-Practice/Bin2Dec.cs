using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsolePractice
{
    internal class Bin2Dec
    {
        internal void Binary2Decimal()
        {
            int num = 9;
            String data = "";
            while (num!=0)
            {
                data += num % 2;
                num = (int)(num/2);
            }
            Console.WriteLine(data);
        }
    }
}
