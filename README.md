# Migratory Birds

Click [here](https://www.hackerrank.com/challenges/migratory-birds/problem) to view the problem on the HackerRank website

[![Run on Repl.it](https://repl.it/badge/github/hamza-mughees/Migratory-Birds)](https://repl.it/github/hamza-mughees/Migratory-Birds)

You have been asked to help study the population of birds migrating across the continent. Each type of bird you are interested in will be identified by an integer value. Each time a particular kind of bird is spotted, its id number will be added to your array of sightings. You would like to be able to find out which type of bird is most common given a list of sightings. Your task is to print the type number of that bird and if two or more types of birds are equally common, choose the type with the smallest ID number.

For example, assume your bird sightings are of types <img src="/tex/7b8fc2a5f165da70bf94d6846137394a.svg?invert_in_darkmode&sanitize=true" align=middle width=125.80472189999998pt height=24.65753399999998pt/>. There are two each of types <img src="/tex/034d0a6be0424bffe9a6e7ac9236c0f5.svg?invert_in_darkmode&sanitize=true" align=middle width=8.219209349999991pt height=21.18721440000001pt/> and <img src="/tex/76c5792347bb90ef71cfbace628572cf.svg?invert_in_darkmode&sanitize=true" align=middle width=8.219209349999991pt height=21.18721440000001pt/>, and one sighting of type <img src="/tex/5dc642f297e291cfdde8982599601d7e.svg?invert_in_darkmode&sanitize=true" align=middle width=8.219209349999991pt height=21.18721440000001pt/>. Pick the lower of the two types seen twice: type <img src="/tex/034d0a6be0424bffe9a6e7ac9236c0f5.svg?invert_in_darkmode&sanitize=true" align=middle width=8.219209349999991pt height=21.18721440000001pt/>.

**Function Description**

Complete the migratoryBirds function in the editor below. It should return the lowest type number of the most frequently sighted bird.

migratoryBirds has the following parameter(s):

- arr: an array of integers representing types of birds sighted

**Input Format**

The first line contains an integer denoting <img src="/tex/55a049b8f161ae7cfeb0197d75aff967.svg?invert_in_darkmode&sanitize=true" align=middle width=9.86687624999999pt height=14.15524440000002pt/>, the number of birds sighted and reported in the array <img src="/tex/d281f79fcdc7bd1171cf0298e4f32012.svg?invert_in_darkmode&sanitize=true" align=middle width=24.435064499999992pt height=14.15524440000002pt/>.  
The second line describes <img src="/tex/d281f79fcdc7bd1171cf0298e4f32012.svg?invert_in_darkmode&sanitize=true" align=middle width=24.435064499999992pt height=14.15524440000002pt/> as <img src="/tex/55a049b8f161ae7cfeb0197d75aff967.svg?invert_in_darkmode&sanitize=true" align=middle width=9.86687624999999pt height=14.15524440000002pt/> space-separated integers representing the type numbers of each bird sighted.

**Constraints**

- <img src="/tex/f1dfa3a3ee1d324f65deabf78505dc33.svg?invert_in_darkmode&sanitize=true" align=middle width=113.22271289999998pt height=26.76175259999998pt/>
- It is guaranteed that each type is <img src="/tex/034d0a6be0424bffe9a6e7ac9236c0f5.svg?invert_in_darkmode&sanitize=true" align=middle width=8.219209349999991pt height=21.18721440000001pt/>, <img src="/tex/76c5792347bb90ef71cfbace628572cf.svg?invert_in_darkmode&sanitize=true" align=middle width=8.219209349999991pt height=21.18721440000001pt/>, <img src="/tex/5dc642f297e291cfdde8982599601d7e.svg?invert_in_darkmode&sanitize=true" align=middle width=8.219209349999991pt height=21.18721440000001pt/>, <img src="/tex/ecf4fe2774fd9244b4fd56f7e76dc882.svg?invert_in_darkmode&sanitize=true" align=middle width=8.219209349999991pt height=21.18721440000001pt/>, or <img src="/tex/9612eecfec9dadf1a81d296bd2473777.svg?invert_in_darkmode&sanitize=true" align=middle width=8.219209349999991pt height=21.18721440000001pt/>.

**Output Format**

Print the type number of the most common bird; if two or more types of birds are equally common, choose the type with the smallest ID number.

**Sample Input 0**
```
6
1 4 4 4 5 3
```

**Sample Output 0***
```
4
```

**Explanation 0**

The different types of birds occur in the following frequencies:

- Type <img src="/tex/034d0a6be0424bffe9a6e7ac9236c0f5.svg?invert_in_darkmode&sanitize=true" align=middle width=8.219209349999991pt height=21.18721440000001pt/>: <img src="/tex/034d0a6be0424bffe9a6e7ac9236c0f5.svg?invert_in_darkmode&sanitize=true" align=middle width=8.219209349999991pt height=21.18721440000001pt/> bird
- Type <img src="/tex/76c5792347bb90ef71cfbace628572cf.svg?invert_in_darkmode&sanitize=true" align=middle width=8.219209349999991pt height=21.18721440000001pt/>: <img src="/tex/29632a9bf827ce0200454dd32fc3be82.svg?invert_in_darkmode&sanitize=true" align=middle width=8.219209349999991pt height=21.18721440000001pt/> birds
- Type <img src="/tex/5dc642f297e291cfdde8982599601d7e.svg?invert_in_darkmode&sanitize=true" align=middle width=8.219209349999991pt height=21.18721440000001pt/>: <img src="/tex/034d0a6be0424bffe9a6e7ac9236c0f5.svg?invert_in_darkmode&sanitize=true" align=middle width=8.219209349999991pt height=21.18721440000001pt/> bird
- Type <img src="/tex/ecf4fe2774fd9244b4fd56f7e76dc882.svg?invert_in_darkmode&sanitize=true" align=middle width=8.219209349999991pt height=21.18721440000001pt/>: <img src="/tex/5dc642f297e291cfdde8982599601d7e.svg?invert_in_darkmode&sanitize=true" align=middle width=8.219209349999991pt height=21.18721440000001pt/> birds
- Type <img src="/tex/9612eecfec9dadf1a81d296bd2473777.svg?invert_in_darkmode&sanitize=true" align=middle width=8.219209349999991pt height=21.18721440000001pt/>: <img src="/tex/034d0a6be0424bffe9a6e7ac9236c0f5.svg?invert_in_darkmode&sanitize=true" align=middle width=8.219209349999991pt height=21.18721440000001pt/> bird  

The type number that occurs at the highest frequency is type <img src="/tex/ecf4fe2774fd9244b4fd56f7e76dc882.svg?invert_in_darkmode&sanitize=true" align=middle width=8.219209349999991pt height=21.18721440000001pt/>, so we print <img src="/tex/ecf4fe2774fd9244b4fd56f7e76dc882.svg?invert_in_darkmode&sanitize=true" align=middle width=8.219209349999991pt height=21.18721440000001pt/> as our answer.

**Sample Input 1**
```
11
1 2 3 4 5 4 3 2 1 3 4
```

**Sample Output 1**
```
3
```

**Explanation 1**

The different types of birds occur in the following frequencies:

- Type <img src="/tex/034d0a6be0424bffe9a6e7ac9236c0f5.svg?invert_in_darkmode&sanitize=true" align=middle width=8.219209349999991pt height=21.18721440000001pt/>: <img src="/tex/76c5792347bb90ef71cfbace628572cf.svg?invert_in_darkmode&sanitize=true" align=middle width=8.219209349999991pt height=21.18721440000001pt/>
- Type <img src="/tex/76c5792347bb90ef71cfbace628572cf.svg?invert_in_darkmode&sanitize=true" align=middle width=8.219209349999991pt height=21.18721440000001pt/>: <img src="/tex/76c5792347bb90ef71cfbace628572cf.svg?invert_in_darkmode&sanitize=true" align=middle width=8.219209349999991pt height=21.18721440000001pt/>
- Type <img src="/tex/5dc642f297e291cfdde8982599601d7e.svg?invert_in_darkmode&sanitize=true" align=middle width=8.219209349999991pt height=21.18721440000001pt/>: <img src="/tex/5dc642f297e291cfdde8982599601d7e.svg?invert_in_darkmode&sanitize=true" align=middle width=8.219209349999991pt height=21.18721440000001pt/>
- Type <img src="/tex/ecf4fe2774fd9244b4fd56f7e76dc882.svg?invert_in_darkmode&sanitize=true" align=middle width=8.219209349999991pt height=21.18721440000001pt/>: <img src="/tex/5dc642f297e291cfdde8982599601d7e.svg?invert_in_darkmode&sanitize=true" align=middle width=8.219209349999991pt height=21.18721440000001pt/>
- Type <img src="/tex/9612eecfec9dadf1a81d296bd2473777.svg?invert_in_darkmode&sanitize=true" align=middle width=8.219209349999991pt height=21.18721440000001pt/>: <img src="/tex/034d0a6be0424bffe9a6e7ac9236c0f5.svg?invert_in_darkmode&sanitize=true" align=middle width=8.219209349999991pt height=21.18721440000001pt/>

Two types have a frequency of <img src="/tex/5dc642f297e291cfdde8982599601d7e.svg?invert_in_darkmode&sanitize=true" align=middle width=8.219209349999991pt height=21.18721440000001pt/>, and the lower of those is type <img src="/tex/5dc642f297e291cfdde8982599601d7e.svg?invert_in_darkmode&sanitize=true" align=middle width=8.219209349999991pt height=21.18721440000001pt/>.
