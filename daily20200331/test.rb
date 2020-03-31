result = ["Hello", "hEllo", "heLlo", "helLo", "hellO"]
Test.assert_equals(wave("hello"), result, "Should return: '#{result}'")

result = ["Codewars", "cOdewars", "coDewars", "codEwars", "codeWars", "codewArs", "codewaRs", "codewarS"]
Test.assert_equals(wave("codewars"), result, "Should return: '#{result}'")

result = []
Test.assert_equals(wave(""), result, "Should return: '#{result}'")

result = ["Two words", "tWo words", "twO words", "two Words", "two wOrds", "two woRds", "two worDs", "two wordS"]
Test.assert_equals(wave("two words"), result, "Should return: '#{result}'")

result = [" Gap ", " gAp ", " gaP "]
Test.assert_equals(wave(" gap "), result, "Should return: '#{result}'")