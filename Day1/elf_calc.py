f = open("day-1\elf_list.txt","r")
lines = f.readlines()

current_elf = 0
elves = []

for line in lines:
    line = line.replace("\n","")

    if line == "" :
        elves.append(current_elf)
        current_elf = 0
    else:
        current_elf += int(line)

elves.sort()
    
print(sum(elves[-3:]))