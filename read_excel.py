

if __name__ == '__main__':

    file2 = open("123.txt")
    set1 = set()
    set2 = set()
    result = set()

    for line2 in file2:

        set2.add(line2)
    result = set2
    print result
