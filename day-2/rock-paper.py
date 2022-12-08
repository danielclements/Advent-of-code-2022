f = open("day-2\strategy.txt")
lines = f.readlines()

scoreMap = {
    "A": [{"X": 4}, {"Y": 8}, {"Z": 3}],
    "B": [{"X": 1}, {"Y": 5}, {"Z": 9}],
    "C": [{"X": 7}, {"Y": 2}, {"Z": 6}]
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

    
    
    







