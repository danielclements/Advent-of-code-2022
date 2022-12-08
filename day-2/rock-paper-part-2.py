f = open("day-2\strategy.txt")
lines = f.readlines()

scoreMap = {
    "A": [{"X": 3}, {"Y": 4}, {"Z": 8}],
    "B": [{"X": 1}, {"Y": 5}, {"Z": 9}],
    "C": [{"X": 2}, {"Y": 6}, {"Z": 7}]
}

totalPoints = 0


for line in lines:
    line = line.replace("\n", "")
    lineItems = line.split()

    outcomes = scoreMap[lineItems[0]]

    for outcome in outcomes:
        for key, value in outcome.items():

            if key == lineItems[1]:
                totalPoints += value
                

print(totalPoints)

    
    
    







