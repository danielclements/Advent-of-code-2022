f = open('Day4\data-set.txt', 'r')
lines = f.readlines()

duplicate_count = 0

for line in lines:
    line = line.replace("\n","")

    splitText = line.split(",")

    elf_1 = splitText[0]
    elf_2 = splitText[1]

    elf1_range_strip = elf_1.split("-")
    elf1_complete_range = set(range(int(elf1_range_strip[0]), int(elf1_range_strip[1])  + 1))

    elf2_range_strip = elf_2.split("-")
    elf2_complete_range = set(range(int(elf2_range_strip[0]), int(elf2_range_strip[1]) + 1 ))


    


    if not elf1_complete_range.isdisjoint(elf2_complete_range):
        duplicate_count += 1
        
    elif not elf2_complete_range.isdisjoint(elf1_complete_range):
        duplicate_count +=1
        
   




print(duplicate_count)

    
    