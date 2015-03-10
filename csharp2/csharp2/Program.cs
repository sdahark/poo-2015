using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace csharp2
{
    public class Program
    {
        static void Main(string[] args)
        {
            Program program = new Program();
            Console.WriteLine(program.SayHello());
        }

        public string SayHello() {
            return "hello";
        }
    }
}
