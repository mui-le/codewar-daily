describe "find_next_square" do
  it "should return the next square for perfect squares" do
    Test.assert_equals(find_next_square(121), 144, "Wrong output for 121")
    Test.assert_equals(find_next_square(625), 676, "Wrong output for 625")
    Test.assert_equals(find_next_square(319225), 320356, "Wrong output for 319225")
    Test.assert_equals(find_next_square(15241383936), 15241630849, "Wrong output for 15241383936")
  end
  
  it "should return -1 for numbers which aren't perfect squares" do
    Test.assert_equals(find_next_square(155), -1, "Wrong output for 155")
    Test.assert_equals(find_next_square(342786627), -1, "Wrong output for 342786627")
  end
end
