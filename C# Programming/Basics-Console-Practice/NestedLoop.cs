using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsolePractice
{
    internal class NestedLoop
    {
        internal void Nesting()
        {
            for (int i = 1; i <= 5; i++)
            {
                for (int j = 1; j <= 6-i; j++)
                {
                    Console.Write(j+ " ");
                }
                Console.WriteLine();
            }
        }
    }
}
