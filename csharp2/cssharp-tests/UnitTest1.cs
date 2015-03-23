using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using csharp2;

namespace cssharp_tests
{
    [TestClass]
    public class UnitTest1
    {
        [TestMethod]
        public void TestMethod1()
        {
            Program program = new Program();

            Assert.AreEqual("hello", program.SayHello());
        }
    }
}
