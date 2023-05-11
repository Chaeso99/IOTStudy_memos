infile = open("data.txt", "r")
outfile = open("ouput.txt", "w")

s = 0
count = 0

for line in infile :
   num = float(line.rstrip( ))
   s += num
   count+= 1

outfile.write("합계:"+str(s) +"\n")
outfile.write("평균:"+str(s/count))

infile.close( )
outfile.close( )
