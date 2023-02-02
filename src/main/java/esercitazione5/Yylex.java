// DO NOT EDIT
// Generated by JFlex 1.8.2 http://jflex.de/
// source: srcjflexcup/newLang.flex


package esercitazione5;
import java_cup.runtime.Symbol; //This is how we pass tokens to the parser


// See https://github.com/jflex-de/jflex/issues/222
@SuppressWarnings("FallThrough")
class Yylex implements java_cup.runtime.Scanner {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
  public static final int YYINITIAL = 0;
  public static final int STRING = 2;
  public static final int COMMENTS = 4;
  public static final int CHAR = 6;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0,  0,  1,  1,  2,  2,  3, 3
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\u10ff\u0100";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\1\0\1\1\1\3\22\0\1\1"+
    "\1\4\1\5\1\0\1\6\1\0\1\7\1\10\1\11"+
    "\1\12\1\13\1\14\1\15\1\16\1\17\1\20\12\21"+
    "\1\22\1\23\1\24\1\25\1\26\2\0\32\6\1\0"+
    "\1\27\1\0\1\30\1\6\1\0\1\31\1\32\1\33"+
    "\1\34\1\35\1\36\1\37\1\40\1\41\2\6\1\42"+
    "\1\6\1\43\1\44\1\45\1\6\1\46\1\47\1\50"+
    "\1\51\1\52\1\53\3\6\1\54\1\55\1\56\u0182\0";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[512];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\4\0\1\1\1\2\1\1\1\3\1\4\1\5\1\6"+
    "\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16"+
    "\1\17\1\20\1\21\1\22\1\23\1\24\17\4\1\25"+
    "\1\26\1\27\1\30\1\31\1\32\1\30\1\33\1\32"+
    "\1\34\4\0\1\35\1\36\1\37\4\4\1\40\4\4"+
    "\1\41\1\42\3\4\1\43\4\4\1\44\4\4\1\0"+
    "\1\2\1\45\1\46\1\47\1\50\1\51\1\52\1\0"+
    "\1\53\1\54\1\55\2\4\1\56\1\4\1\57\1\4"+
    "\1\60\2\4\1\61\1\4\1\62\1\63\7\4\1\64"+
    "\2\4\2\0\1\2\1\65\1\0\1\4\1\66\1\67"+
    "\1\4\1\70\1\4\1\71\1\72\2\4\1\73\1\4"+
    "\1\74\1\75\1\76\2\4\1\77\4\4\1\100\2\4"+
    "\1\101\1\102\1\103\1\104\1\105";

  private static int [] zzUnpackAction() {
    int [] result = new int[151];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\57\0\136\0\215\0\274\0\274\0\353\0\274"+
    "\0\u011a\0\274\0\274\0\274\0\274\0\274\0\274\0\274"+
    "\0\u0149\0\u0178\0\u01a7\0\274\0\274\0\u01d6\0\274\0\u0205"+
    "\0\274\0\u0234\0\u0263\0\u0292\0\u02c1\0\u02f0\0\u031f\0\u034e"+
    "\0\u037d\0\u03ac\0\u03db\0\u040a\0\u0439\0\u0468\0\u0497\0\u04c6"+
    "\0\274\0\u04f5\0\274\0\u0524\0\274\0\u0553\0\u0582\0\274"+
    "\0\u05b1\0\274\0\u05e0\0\u060f\0\u063e\0\u066d\0\274\0\274"+
    "\0\274\0\u069c\0\u06cb\0\u06fa\0\u0729\0\u011a\0\u0758\0\u0787"+
    "\0\u07b6\0\u07e5\0\u011a\0\u0814\0\u0843\0\u0872\0\u08a1\0\u011a"+
    "\0\u08d0\0\u08ff\0\u092e\0\u095d\0\u011a\0\u098c\0\u09bb\0\u09ea"+
    "\0\u0a19\0\u0a48\0\u0a77\0\274\0\274\0\274\0\274\0\274"+
    "\0\u0aa6\0\u0ad5\0\u063e\0\274\0\u011a\0\u0b04\0\u0b33\0\u011a"+
    "\0\u0b62\0\u011a\0\u0b91\0\u011a\0\u0bc0\0\u0bef\0\u011a\0\u0c1e"+
    "\0\u011a\0\u011a\0\u0c4d\0\u0c7c\0\u0cab\0\u0cda\0\u0d09\0\u0d38"+
    "\0\u0d67\0\u011a\0\u0d96\0\u0dc5\0\u0df4\0\u0e23\0\u0e52\0\274"+
    "\0\u0e81\0\u0eb0\0\u011a\0\u011a\0\u0edf\0\u011a\0\u0f0e\0\u011a"+
    "\0\u011a\0\u0f3d\0\u0f6c\0\u011a\0\u0f9b\0\u011a\0\u011a\0\u011a"+
    "\0\u0fca\0\u0ff9\0\u011a\0\u1028\0\u1057\0\u1086\0\u10b5\0\u011a"+
    "\0\u10e4\0\u1113\0\u011a\0\274\0\u011a\0\u011a\0\u011a";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[151];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\5\3\6\1\7\1\10\1\11\1\12\1\13\1\14"+
    "\1\15\1\16\1\17\1\20\1\21\1\5\1\22\1\23"+
    "\1\24\1\25\1\26\1\27\1\30\1\5\1\31\1\32"+
    "\1\33\1\34\1\35\1\36\1\37\2\11\1\40\1\41"+
    "\1\42\1\43\1\11\1\44\1\45\1\46\1\11\1\47"+
    "\1\50\1\51\1\52\1\53\2\54\2\5\1\54\1\55"+
    "\21\54\1\56\27\54\57\5\2\57\2\5\4\57\1\60"+
    "\16\57\1\61\27\57\104\0\1\62\37\0\1\11\12\0"+
    "\1\11\7\0\23\11\21\0\1\63\53\0\1\64\62\0"+
    "\1\65\1\0\1\23\53\0\1\66\5\0\1\67\1\70"+
    "\1\62\55\0\1\71\37\0\1\11\12\0\1\11\7\0"+
    "\12\11\1\72\10\11\11\0\1\11\12\0\1\11\7\0"+
    "\13\11\1\73\7\11\11\0\1\11\12\0\1\11\7\0"+
    "\7\11\1\74\13\11\11\0\1\11\12\0\1\11\7\0"+
    "\4\11\1\75\6\11\1\76\7\11\11\0\1\11\12\0"+
    "\1\11\7\0\11\11\1\77\1\100\10\11\11\0\1\11"+
    "\12\0\1\11\7\0\1\101\12\11\1\102\7\11\11\0"+
    "\1\11\12\0\1\11\7\0\5\11\1\103\4\11\1\104"+
    "\10\11\11\0\1\11\12\0\1\11\7\0\4\11\1\105"+
    "\6\11\1\106\7\11\11\0\1\11\12\0\1\11\7\0"+
    "\13\11\1\107\7\11\11\0\1\11\12\0\1\11\7\0"+
    "\15\11\1\110\2\11\1\111\2\11\11\0\1\11\12\0"+
    "\1\11\7\0\4\11\1\112\16\11\11\0\1\11\12\0"+
    "\1\11\7\0\17\11\1\113\3\11\11\0\1\11\12\0"+
    "\1\11\7\0\7\11\1\114\3\11\1\115\1\11\1\116"+
    "\5\11\11\0\1\11\12\0\1\11\7\0\1\117\12\11"+
    "\1\120\7\11\11\0\1\11\12\0\1\11\7\0\7\11"+
    "\1\121\13\11\16\0\1\122\41\0\1\123\1\0\2\54"+
    "\2\0\1\54\1\0\21\54\1\0\27\54\5\0\1\124"+
    "\35\0\1\125\2\0\1\126\1\0\1\127\6\0\2\57"+
    "\2\0\4\57\1\0\16\57\1\0\27\57\10\0\1\130"+
    "\32\0\1\125\2\0\1\126\1\0\1\127\34\0\1\131"+
    "\43\0\1\132\64\0\1\133\53\0\1\134\46\0\1\11"+
    "\12\0\1\11\7\0\3\11\1\135\17\11\11\0\1\11"+
    "\12\0\1\11\7\0\13\11\1\136\7\11\11\0\1\11"+
    "\12\0\1\11\7\0\1\137\22\11\11\0\1\11\12\0"+
    "\1\11\7\0\5\11\1\140\15\11\11\0\1\11\12\0"+
    "\1\11\7\0\16\11\1\141\4\11\11\0\1\11\12\0"+
    "\1\11\7\0\3\11\1\142\17\11\11\0\1\11\12\0"+
    "\1\11\7\0\11\11\1\143\11\11\11\0\1\11\12\0"+
    "\1\11\7\0\15\11\1\144\5\11\11\0\1\11\12\0"+
    "\1\11\7\0\10\11\1\145\6\11\1\146\3\11\11\0"+
    "\1\11\12\0\1\11\7\0\17\11\1\147\3\11\11\0"+
    "\1\11\12\0\1\11\7\0\13\11\1\150\7\11\11\0"+
    "\1\11\12\0\1\11\7\0\17\11\1\151\3\11\11\0"+
    "\1\11\12\0\1\11\7\0\17\11\1\152\3\11\11\0"+
    "\1\11\12\0\1\11\7\0\1\153\16\11\1\154\3\11"+
    "\11\0\1\11\12\0\1\11\7\0\1\155\3\11\1\156"+
    "\10\11\1\157\5\11\11\0\1\11\12\0\1\11\7\0"+
    "\4\11\1\160\16\11\11\0\1\11\12\0\1\11\7\0"+
    "\20\11\1\161\2\11\11\0\1\11\12\0\1\11\7\0"+
    "\15\11\1\162\5\11\11\0\1\11\12\0\1\11\7\0"+
    "\10\11\1\163\12\11\11\0\1\11\12\0\1\11\7\0"+
    "\10\11\1\164\12\11\3\0\13\165\1\166\43\165\2\123"+
    "\1\6\1\167\53\123\4\0\1\170\52\0\13\132\1\171"+
    "\43\132\6\0\1\11\12\0\1\11\7\0\11\11\1\172"+
    "\11\11\11\0\1\11\12\0\1\11\7\0\15\11\1\173"+
    "\5\11\11\0\1\11\12\0\1\11\7\0\4\11\1\174"+
    "\16\11\11\0\1\11\12\0\1\11\7\0\16\11\1\175"+
    "\4\11\11\0\1\11\12\0\1\11\7\0\17\11\1\176"+
    "\3\11\11\0\1\11\12\0\1\11\7\0\4\11\1\177"+
    "\16\11\11\0\1\11\12\0\1\11\7\0\14\11\1\200"+
    "\6\11\11\0\1\11\12\0\1\11\7\0\11\11\1\201"+
    "\11\11\11\0\1\11\12\0\1\11\7\0\20\11\1\202"+
    "\2\11\11\0\1\11\12\0\1\11\7\0\15\11\1\203"+
    "\5\11\11\0\1\11\12\0\1\11\7\0\14\11\1\204"+
    "\6\11\11\0\1\11\12\0\1\11\7\0\10\11\1\205"+
    "\12\11\11\0\1\11\12\0\1\11\7\0\12\11\1\206"+
    "\10\11\11\0\1\11\12\0\1\11\7\0\4\11\1\207"+
    "\16\11\11\0\1\11\12\0\1\11\7\0\3\11\1\210"+
    "\17\11\11\0\1\11\12\0\1\11\7\0\11\11\1\211"+
    "\11\11\3\0\55\165\1\6\1\165\13\0\1\166\4\0"+
    "\1\6\40\0\1\6\54\0\13\132\1\171\4\132\1\6"+
    "\36\132\6\0\1\11\12\0\1\11\7\0\4\11\1\212"+
    "\16\11\11\0\1\11\12\0\1\11\7\0\4\11\1\213"+
    "\16\11\11\0\1\11\12\0\1\11\7\0\6\11\1\214"+
    "\14\11\11\0\1\11\12\0\1\11\7\0\15\11\1\215"+
    "\5\11\11\0\1\11\12\0\1\11\7\0\17\11\1\216"+
    "\3\11\11\0\1\11\12\0\1\11\7\0\12\11\1\217"+
    "\10\11\11\0\1\11\12\0\1\11\7\0\4\11\1\220"+
    "\16\11\11\0\1\11\12\0\1\11\7\0\1\221\22\11"+
    "\11\0\1\11\12\0\1\11\7\0\4\11\1\222\16\11"+
    "\11\0\1\11\12\0\1\11\7\0\12\11\1\223\10\11"+
    "\11\0\1\11\12\0\1\11\1\224\6\0\23\11\11\0"+
    "\1\11\12\0\1\11\7\0\6\11\1\225\14\11\11\0"+
    "\1\11\12\0\1\11\7\0\12\11\1\226\10\11\11\0"+
    "\1\11\12\0\1\11\7\0\15\11\1\227\5\11\3\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4418];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\4\0\2\11\1\1\1\11\1\1\7\11\3\1\2\11"+
    "\1\1\1\11\1\1\1\11\17\1\1\11\1\1\1\11"+
    "\1\1\1\11\2\1\1\11\1\1\1\11\4\0\3\11"+
    "\30\1\1\0\1\1\5\11\1\1\1\0\1\1\1\11"+
    "\30\1\2\0\1\1\1\11\1\0\32\1\1\11\3\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[151];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  @SuppressWarnings("unused")
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  @SuppressWarnings("unused")
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  private boolean zzEOFDone;

  /* user code: */

StringBuffer string = new StringBuffer();


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Yylex(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length * 2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException(
          "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE) {
      zzBuffer = new char[ZZ_BUFFERSIZE];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
  yyclose();    }
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  @Override  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
            switch (zzLexicalState) {
            case STRING: {
              throw new Error("Stringa non chiusa");
            }  // fall though
            case 152: break;
            case CHAR: {
              throw new Error("char non chiusa");
            }  // fall though
            case 153: break;
            default:
              {
                return new Symbol(sym.EOF);
              }
        }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { throw new Error("\n\nIllegal character < "+ yytext()+" >\n");
            }
            // fall through
          case 70: break;
          case 2:
            { /* ignore */
            }
            // fall through
          case 71: break;
          case 3:
            { string.setLength(0); yybegin(STRING);
            }
            // fall through
          case 72: break;
          case 4:
            { return new Symbol(sym.ID,yytext());
            }
            // fall through
          case 73: break;
          case 5:
            { return new Symbol(sym.STR_CONCAT);
            }
            // fall through
          case 74: break;
          case 6:
            { string.setLength(0); yybegin(CHAR);
            }
            // fall through
          case 75: break;
          case 7:
            { return new Symbol(sym.LPAR);
            }
            // fall through
          case 76: break;
          case 8:
            { return new Symbol(sym.RPAR);
            }
            // fall through
          case 77: break;
          case 9:
            { return new Symbol(sym.TIMES);
            }
            // fall through
          case 78: break;
          case 10:
            { return new Symbol(sym.PLUS);
            }
            // fall through
          case 79: break;
          case 11:
            { return new Symbol(sym.COMMA);
            }
            // fall through
          case 80: break;
          case 12:
            { return new Symbol(sym.MINUS);
            }
            // fall through
          case 81: break;
          case 13:
            { return new Symbol(sym.DIV);
            }
            // fall through
          case 82: break;
          case 14:
            { return new Symbol(sym.INTEGER_CONST, Integer.parseInt(yytext().toString()));
            }
            // fall through
          case 83: break;
          case 15:
            { return new Symbol(sym.COLON);
            }
            // fall through
          case 84: break;
          case 16:
            { return new Symbol(sym.SEMI);
            }
            // fall through
          case 85: break;
          case 17:
            { return new Symbol(sym.LT);
            }
            // fall through
          case 86: break;
          case 18:
            { return new Symbol(sym.EQ);
            }
            // fall through
          case 87: break;
          case 19:
            { return new Symbol(sym.GT);
            }
            // fall through
          case 88: break;
          case 20:
            { return new Symbol(sym.POW);
            }
            // fall through
          case 89: break;
          case 21:
            { return new Symbol(sym.LBRACK);
            }
            // fall through
          case 90: break;
          case 22:
            { return new Symbol(sym.PIPE);
            }
            // fall through
          case 91: break;
          case 23:
            { return new Symbol(sym.RBRACK);
            }
            // fall through
          case 92: break;
          case 24:
            { string.append( yytext() );
            }
            // fall through
          case 93: break;
          case 25:
            { yybegin(YYINITIAL);
            return new Symbol( sym.STRING_CONST, string.toString());
            }
            // fall through
          case 94: break;
          case 26:
            { string.append('\\');
            }
            // fall through
          case 95: break;
          case 27:
            { yybegin(YYINITIAL);
            return new Symbol( sym.CHAR_CONST, string.toString());
            }
            // fall through
          case 96: break;
          case 28:
            { return new Symbol(sym.NE);
            }
            // fall through
          case 97: break;
          case 29:
            { return new Symbol(sym.ASSIGN);
            }
            // fall through
          case 98: break;
          case 30:
            { return new Symbol(sym.LE);
            }
            // fall through
          case 99: break;
          case 31:
            { return new Symbol(sym.GE);
            }
            // fall through
          case 100: break;
          case 32:
            { return new Symbol(sym.DO);
            }
            // fall through
          case 101: break;
          case 33:
            { return new Symbol(sym.IF);
            }
            // fall through
          case 102: break;
          case 34:
            { return new Symbol(sym.IN);
            }
            // fall through
          case 103: break;
          case 35:
            { return new Symbol(sym.OR);
            }
            // fall through
          case 104: break;
          case 36:
            { return new Symbol(sym.TO);
            }
            // fall through
          case 105: break;
          case 37:
            { string.append('\"');
            }
            // fall through
          case 106: break;
          case 38:
            { string.append('\n');
            }
            // fall through
          case 107: break;
          case 39:
            { string.append('\r');
            }
            // fall through
          case 108: break;
          case 40:
            { string.append('\t');
            }
            // fall through
          case 109: break;
          case 41:
            { string.append('\'');
            }
            // fall through
          case 110: break;
          case 42:
            { return new Symbol(sym.WRITE);
            }
            // fall through
          case 111: break;
          case 43:
            { return new Symbol(sym.REAL_CONST, Float.parseFloat(yytext().toString()));
            }
            // fall through
          case 112: break;
          case 44:
            { return new Symbol(sym.READ);
            }
            // fall through
          case 113: break;
          case 45:
            { return new Symbol(sym.AND);
            }
            // fall through
          case 114: break;
          case 46:
            { return new Symbol(sym.DEF);
            }
            // fall through
          case 115: break;
          case 47:
            { return new Symbol(sym.END);
            }
            // fall through
          case 116: break;
          case 48:
            { return new Symbol(sym.FOR);
            }
            // fall through
          case 117: break;
          case 49:
            { return new Symbol(sym.LET);
            }
            // fall through
          case 118: break;
          case 50:
            { return new Symbol(sym.NOT);
            }
            // fall through
          case 119: break;
          case 51:
            { return new Symbol(sym.OUT);
            }
            // fall through
          case 120: break;
          case 52:
            { return new Symbol(sym.VAR);
            }
            // fall through
          case 121: break;
          case 53:
            { return new Symbol(sym.WRITELN);
            }
            // fall through
          case 122: break;
          case 54:
            { return new Symbol(sym.CHAR);
            }
            // fall through
          case 123: break;
          case 55:
            { return new Symbol(sym.ELSE);
            }
            // fall through
          case 124: break;
          case 56:
            { return new Symbol(sym.INIT);
            }
            // fall through
          case 125: break;
          case 57:
            { return new Symbol(sym.LOOP);
            }
            // fall through
          case 126: break;
          case 58:
            { return new Symbol(sym.REAL);
            }
            // fall through
          case 127: break;
          case 59:
            { return new Symbol(sym.STEP);
            }
            // fall through
          case 128: break;
          case 60:
            { return new Symbol(sym.THEN);
            }
            // fall through
          case 129: break;
          case 61:
            { return new Symbol(sym.TRUE);
            }
            // fall through
          case 130: break;
          case 62:
            { return new Symbol(sym.VOID);
            }
            // fall through
          case 131: break;
          case 63:
            { return new Symbol(sym.FALSE);
            }
            // fall through
          case 132: break;
          case 64:
            { return new Symbol(sym.WHILE);
            }
            // fall through
          case 133: break;
          case 65:
            { return new Symbol(sym.RETURN);
            }
            // fall through
          case 134: break;
          case 66:
            { return new Symbol(sym.MAIN) ;
            }
            // fall through
          case 135: break;
          case 67:
            { return new Symbol(sym.STRING);
            }
            // fall through
          case 136: break;
          case 68:
            { return new Symbol(sym.BOOL);
            }
            // fall through
          case 137: break;
          case 69:
            { return new Symbol(sym.INTEGER);
            }
            // fall through
          case 138: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
