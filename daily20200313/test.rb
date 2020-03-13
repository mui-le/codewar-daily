require "test/unit/assertions"
include Test::Unit::Assertions

Test.assert_equals(delete_nth([20,37,20,21], 1), [20,37,21], "From array [20,37,20,21],1 you get")
Test.assert_equals(delete_nth([1,1,3,3,7,2,2,2,2], 3), [1, 1, 3, 3, 7, 2, 2, 2], "From array [1,1,3,3,7,2,2,2,2],3 you get")