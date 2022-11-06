# C Tests:
echo "COMMENCING THE 'C' LEVEL TESTING"
build/bin/wplc -o WPLC.ll sandbox/C_Tests/positive_1/wpl.wpl
echo "Ran Positive Test 1. Look at WPLC.ll to see the results."
echo "Hit 'enter' to continue:"
read test1
build/bin/wplc -o WPLC.ll sandbox/C_Tests/positive_2/wpl.wpl
echo "Ran Positive Test 2. Look at WPLC.ll to see the results."
echo "Hit 'enter' to continue:"
read test2
build/bin/wplc -o WPLC.ll sandbox/C_Tests/negative_1/wpl.wpl
echo "Ran Negative Test 1. Look at WPLC.ll to see the results."
echo "Hit 'enter' to continue:"
read test3
build/bin/wplc -o WPLC.ll sandbox/C_Tests/negative_2/wpl.wpl
echo "Ran Negative Test 2. Look at WPLC.ll to see the results."
echo "Hit 'enter' to continue to the 'B' level tests:"
read test4


# B Tests:
clear
echo "COMMENCING THE 'B' LEVEL TESTING\n"
build/bin/wplc -o WPLC.ll sandbox/B_Tests/positive_1/wpl.wpl
echo "Ran Positive Test 1. Look at WPLC.ll to see the results."
echo "Hit 'enter' to continue:"
read test5
build/bin/wplc -o WPLC.ll sandbox/B_Tests/positive_2/wpl.wpl
echo "Ran Positive Test 2. Look at WPLC.ll to see the results."
echo "Hit 'enter' to continue:"
read test6
build/bin/wplc -o WPLC.ll sandbox/B_Tests/negative_1/wpl.wpl
echo "Ran Negative Test 1. Look at WPLC.ll to see the results."
echo "Hit 'enter' to continue:"
read test7
build/bin/wplc -o WPLC.ll sandbox/B_Tests/negative_2/wpl.wpl
echo "Ran Negative Test 2. Look at WPLC.ll to see the results."
echo "Hit 'enter' to continue to the 'A' level tests:"
read test8

# A Tests:
clear 
echo "COMMENCING THE 'A' LEVEL TESTING\n"
build/bin/wplc -o WPLC.ll sandbox/A_Tests/positive_1/wpl.wpl
echo "Ran Positive Test 1. Look at WPLC.ll to see the results."
echo "Hit 'enter' to continue:"
read test9
build/bin/wplc -o WPLC.ll sandbox/A_Tests/positive_2/wpl.wpl
echo "Ran Positive Test 2. Look at WPLC.ll to see the results."
echo "Hit 'enter' to continue:"
read test10
build/bin/wplc -o WPLC.ll sandbox/A_Tests/negative_1/wpl.wpl
echo "Ran Negative Test 1. Look at WPLC.ll to see the results."
echo "Hit 'enter' to continue:"
read test11
build/bin/wplc -o WPLC.ll sandbox/A_Tests/negative_2/wpl.wpl
echo "Ran Negative Test 2. Look at WPLC.ll to see the results."
echo "Thank you for watching! Hit 'enter' to exit:"
read test12