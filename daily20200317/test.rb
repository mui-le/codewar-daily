Test.describe("nb_year") do
  Test.it("Basic tests") do
    Test.assert_equals(nb_year(1500, 5, 100, 5000), 15)
    Test.assert_equals(nb_year(1500000, 2.5, 10000, 2000000), 10)
    Test.assert_equals(nb_year(1500000, 0.25, 1000, 2000000), 94)
  end 
end