class Node:
    def __init__(self, value):
        self.value = value
        self.children = []

def tree(li):
    nodes = [Node(i) for i in li]
    for i in range(1, len(li)):
        nodes[(i - 1) // 2].children.append(nodes[i])
    return nodes[0]

def calc(node, level=0):
    if node is None:
        return 0
    return (node.value if level % 2 == 1 else 0) + sum(calc(n, level + 1) for n in node.children)

li = [3, 5, 8, 12, 15, 18, 21]

root = tree(li)

print(calc(root))

""" 
● li = [3, 5, 8, 12, 15, 18, 21]

for i in range(1, len(li)):
1 ~ 7이니까 1부터 6까지 할거임 

(1) nodes[(1 - 1) // 2].children.append(nodes[1])
> nodes[0] 3에 5

(2) nodes[(2 - 1) // 2].children.append(nodes[2])
> nodes[0] 3에 8

(3) nodes[(3 - 1) // 2].children.append(nodes[3])
> nodes[1] 5에 12

(4) nodes[(4 - 1) // 2].children.append(nodes[4])
> nodes[1] 5에 15

(5) nodes[(5 - 1) // 2].children.append(nodes[5])
> nodes[2] 8에 18

(6) nodes[(6 - 1) // 2].children.append(nodes[6])
> nodes[2] 8에 21


    		 3
     	   /  \
   	     5     8
	    / \   /  \
	  12  15  18  21

(node.value if level % 2 == 1 else 0) + sum(calc(n, level + 1) for n in node.children)
 (level=0) 0 + (sum(calc(n, 0 + 1) for n in node.children)

*  (sum(calc(n, 0 + 1) for n in node.children)
- 1.  for n in node.children = 5,8 
- 2. calc(n, 0 + 1) => calc(5, 0 + 1) + calc(8, 0 + 1)


* calc(5, 1)
5 + sum(calc(n, level + 1) for n in node.children)
- 1.  for n in node.children = 12, 15
- calc(n, 1 + 1) => calc(12, 2) + calc(15, 2)

*  calc(12, 2) 
0 + 0

* calc(8, 1)
- 1.  for n in node.children = 18, 21
8 + ( calc(18, 2) + calc(21, 2) )

"""