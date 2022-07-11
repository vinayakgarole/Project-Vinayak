echo "Enter value 1"
read a
echo "Enter value 2"
read b
echo "Enter value 3"
read c
d=$((a+b*c))
echo $d

d=$((a*b+c))
echo $d

d=$((c+a/b))

d=$((a%b+c))
echo $d
