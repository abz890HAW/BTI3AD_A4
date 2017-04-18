TEX = pdflatex
TEXFLAGS = -interaction=nonstopmode -output-directory=out

.PHONY: all clean

all : main.pdf

clean :
	rm -f out/*

main.pdf : tex/main.tex lists
	$(TEX) $(TEXFLAGS) $^

lists : tex/main.tex
	$(TEX) $(TEXFLAGS) $^
