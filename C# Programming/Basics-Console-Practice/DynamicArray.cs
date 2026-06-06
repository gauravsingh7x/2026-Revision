using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsolePractice
{
    internal class DynamicArray
    {
        internal void DyArray()
        {
            int size;
            Console.Write("Enter the Size of Array: ");
            size = Convert.ToInt32(Console.ReadLine());

            int[] arr = new int[size];

            for (int i = 0; i < arr.Length; i++)
            {
                Console.Write("Enter the Number of Array: ");
                arr[i] = Convert.ToInt32(Console.ReadLine());

            }

            Console.WriteLine("Dynamic Array by for each loop");
            foreach (int i in arr)
            {
                Console.WriteLine(i);
            }
        }
    }
}
