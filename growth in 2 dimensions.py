def countMax (upRight):
  a =[0] * len (upRight)
  b =[0] * len (upRight) 
  
  for i in range (0, len (upRight)):
     temp = upRight[i].split (" ")
     a[i] = int (temp[0])
     b[i] = int(temp[1])
     
  return min(a) * min(b)
