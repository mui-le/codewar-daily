Test.assert_equals(validate(123), false)
Test.assert_equals(validate(1), false)
Test.assert_equals(validate(2121), true)
Test.assert_equals(validate(1230), true)