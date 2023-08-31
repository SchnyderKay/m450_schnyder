using NUnit;
using UnitTesting;

namespace UnitTesting.Test
{
    public class Tests
    {
        Calculator calc;
        [SetUp]
        public void Setup()
        {
            calc = new Calculator();
        }

        [Test]
        [TestCase(123, 342, 465)]
        [TestCase(12.34, 3.6, 15.94)]
        [TestCase(9.999, 0.001, 10)]
        public void TestAdd(double num1, double num2, double expected)
        {
            var result = calc.Add(num1, num2);

            Assert.That(result, Is.EqualTo(expected));
        }

        [Test]
        [TestCase(23, 1, 22)]
        [TestCase(16.45, 3.1, 13.35)]
        [TestCase(9, 0.1, 8.9)]
        public void TestSubtract(double num1, double num2, double expected)
        {
            var result = calc.Subract(num1, num2);

            Assert.That(result, Is.EqualTo(expected));
        }

        [Test]
        [TestCase(34, 12, 408)]
        [TestCase(5.3, 8.1, 42.93)]
        [TestCase(9, 0.1, 0.9)]
        public void TestMultiply(double num1, double num2, double expected)
        {
            var result = calc.Multiply(num1, num2);

            Assert.That(result, Is.EqualTo(expected));
        }

        [Test]
        [TestCase(12, 2, 6)]
        [TestCase(206622, 234, 883)]
        [TestCase(9, 0.1, 90)]
        public void TestDivide(double num1, double num2, double expected)
        {
            var result = calc.Divide(num1, num2);

            Assert.That(result, Is.EqualTo(expected));
        }


        [Test]
        [TestCase(12, 0)]
        [TestCase(206622, 0)]
        [TestCase(9.999, 0)]
        public void TestDivideWithZero(double num1, double num2)
        {
            var result = calc.Divide(num1, num2);

            Assert.IsTrue(Double.IsInfinity(result));
        }
    }
}