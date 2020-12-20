{\rtf1\ansi\ansicpg1252\cocoartf2513
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;\f1\fswiss\fcharset0 Helvetica-Oblique;}
{\colortbl;\red255\green255\blue255;\red191\green100\blue38;\red32\green32\blue32;\red254\green187\blue91;
\red153\green168\blue186;\red86\green132\blue173;\red88\green118\blue71;\red133\green96\blue154;}
{\*\expandedcolortbl;;\csgenericrgb\c74902\c39216\c14902;\csgenericrgb\c12549\c12549\c12549;\csgenericrgb\c99608\c73333\c35686;
\csgenericrgb\c60000\c65882\c72941;\csgenericrgb\c33725\c51765\c67843;\csgenericrgb\c34510\c46275\c27843;\csgenericrgb\c52157\c37647\c60392;}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx560\tx1120\tx1680\tx2240\tx2800\tx3360\tx3920\tx4480\tx5040\tx5600\tx6160\tx6720\pardirnatural\partightenfactor0

\f0\fs24 \cf2 \cb3 public void \cf4 treesInTrajectory\cf5 (ArrayList<String> grid) \{\
    String currentLine\cf2 ;\
    int \cf5 currentLineLength\cf2 ;\
    int \cf5 rightValue = \cf6 0\cf2 ;\
    int \cf5 treeCount = \cf6 0\cf2 ;\
\
    for \cf5 (\cf2 int \cf5 i = \cf6 2\cf2 ; \cf5 i < grid.size()\cf2 ; \cf5 i += \cf6 2\cf5 ) \{\
        currentLine = grid.get(i)\cf2 ;\
        \cf5 currentLineLength = grid.get(i).length()\cf2 ;\
        \cf5 rightValue = (rightValue + \cf6 1\cf5 ) % currentLineLength\cf2 ;\
\
        if \cf5 (currentLine.charAt(rightValue) == \cf7 '#'\cf5 ) \{\cf2 \
            \cf5 treeCount++\cf2 ;\
        \cf5 \}\cf2 \
\
    \cf5 \}\
\
    System.
\f1\i \cf8 out
\f0\i0 \cf5 .println(\cf7 "Num trees: " \cf5 + treeCount)\cf2 ;\
\cf5 \}\
}