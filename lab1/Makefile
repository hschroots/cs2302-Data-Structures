
TARGETS = fibn2 fibn_memo fibn_const

CXX = g++
CXXLAGS = -g

.PHONY: clean all

all: $(TARGETS)

%.o : %.cpp
	$(CXX) $(CXXFLAGS) -c $< -o $@

fibn2 : fibn2.o
	$(CXX) $(CXXFLAGS) $< -o $@.out

fibn_memo : fibn_memo.o
	$(CXX) $(CXXFLAGS) $< -o $@.out

fibn_const : fibn_const.o
	$(CXX) $(CXXFLAGS) $< -o $@.out
clean:
	rm *.o
	rm *.out
