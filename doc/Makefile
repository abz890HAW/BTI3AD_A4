TEX = pdflatex
TEXFLAGS = -interaction=nonstopmode

.PHONY: all clean

all : main.pdf

clean :
	rm -f *.aux *.log *.toc *.lof *.lot *.lol *.toc

main.pdf : tex/main.tex lists
	$(TEX) $(TEXFLAGS) $^

lists : tex/main.tex
	$(TEX) $(TEXFLAGS) $^
