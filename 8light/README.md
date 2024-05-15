# 8light
Project was built using eclipse and all of the Eclipse files are checked-in if you would like to download the project and run it via Eclipse.
Otherwise, if you have MAven installed on your class path, you can go to the project directory and run: mvn test

Comments
1. Challenge 1: I used regex to split the incoming string into a list of elements (I don't know the regex by hearts, so I had to look it up). Then I iterated through the list and filtered out each no-nnumeric item and appended the numeric items into a string using String Builder. O(n)<- performance but may use more memory as I am not sure about the StringBuilder.
2. Challenge 2: This was interesting. While there is a very manual way of performing this, I chose to use streams to provide all of the distinct values and return them as a List. I think the goal in this challenge was to better investigate the use of generics than the actual algorithm itself. O(n)<- performance but may be slower because of the use of reflection.
3. Challenge 3: This challenge simple demonstrates the use of the previous 2 Challenges and pulling data from a Map. I do not believe I proved the best implementation, but one that works. O(n)<- performance but may be slower because of the use of reflection.


Time
I ran over a bit, but only because I lost track of the time and wanted to get all 3 done.

Time start: 12:15pm
Time End: 1:22pm
Time Ending Questions: 1:40pm

Test
I could have probably created 10+ more tests but ran out of time.

Question
How might your design differ if the list of specialties was expected to never change? What if changes frequently?

I built my solution for Challenge 3 as if they would never change. I memo-ized the specialties into a map to make the querying O(1). If that map changed frequently, There would be 2 options:
1. Require that the caller of the method to provide the specialties (in  map instead of the 2 dimensional array).
2. Have the method call out to a 3rd party(db, service, etc) to get the map of specialties. 

How might you extend your solution to process tens of millions of elements in the list of IDs? The list of specialties? Both?
1. No matter the input size of IDs, the best performance would be O(n) on cleaning up the non-numerics and the duplicates.
2. By memo-izing the specialties into a Map, the performance was limited to O(n) for building the map and O(1) searching the map.

I always lean towards improving performance over memory usage as you can always expand the memory base, but can't always buy performance gains.