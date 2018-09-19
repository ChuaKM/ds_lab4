import random

def main():
    size = [50, 500, 1000, 2000, 5000, 10000, 15000]
    type = ["Random", "Ascending", "Descending"]

    # iterate through each file size
    for n in size:

        # and each file type
        for name in type:

            # hold our values in a list
            input_list = list()

            # open file to be generated
            input_file = open("input_" + name + str(n) + ".txt", 'w')

            # create sequence of numbers
            for val in range(n):

                # max - current input will create descending order
                if name == "Descending":
                    elem = n - val
                    input_list.append(elem)

                # ascending/random, append normally
                else:
                    input_list.append(val)

            # shuffle numbers for random files
            if name == "Random":
                random.shuffle(input_list)

            # write the list to each input file
            for elem in input_list:
                input_file.write(str(elem))
                input_file.write("\n")

            input_file.close()

if __name__ == "__main__":
    main()