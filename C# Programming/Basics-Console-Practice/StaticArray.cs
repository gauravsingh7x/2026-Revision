using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsolePractice
{
    internal class StaticArray
    {
        internal void StaticArr()
        {
            int[] arr = {2, 5, 6, 7, 3 };
            Console.WriteLine("Static Array by for loop");
            for (int i=0; i<arr.Length; i++)
            {
                Console.WriteLine(arr[i]);
            }

            Console.WriteLine("Staic Araray by for each loop");
            foreach (int i in arr)
            {
                Console.WriteLine(i);
            }
        }
    }
}
