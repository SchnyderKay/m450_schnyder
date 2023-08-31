using grundlagen;
using NUnit;

namespace grundlagen.test
{
    public class Tests
    {
        [SetUp]
        public void Setup()
        {
        }

        [Test]
        public void TestPrice()
        {
            Pricing pricing = new Pricing();
            Assert.IsNotNull(pricing);

            Assert.AreEqual(pricing.calculatePrice(5.5, 12.3, 40, 5, 20), 48.7);
            Assert.AreEqual(pricing.calculatePrice(50.6, 22.7, 23.34, 12, 7.9), 90.3086);
            Assert.AreEqual(pricing.calculatePrice(0, 94.3, 4.3, 0, 5.3), 98.3721);
        }
    }
}