
// Generated from Calculator.g4 by ANTLR 4.10.1


#include "CalculatorLexer.h"


using namespace antlr4;



using namespace antlr4;

namespace {

struct CalculatorLexerStaticData final {
  CalculatorLexerStaticData(std::vector<std::string> ruleNames,
                          std::vector<std::string> channelNames,
                          std::vector<std::string> modeNames,
                          std::vector<std::string> literalNames,
                          std::vector<std::string> symbolicNames)
      : ruleNames(std::move(ruleNames)), channelNames(std::move(channelNames)),
        modeNames(std::move(modeNames)), literalNames(std::move(literalNames)),
        symbolicNames(std::move(symbolicNames)),
        vocabulary(this->literalNames, this->symbolicNames) {}

  CalculatorLexerStaticData(const CalculatorLexerStaticData&) = delete;
  CalculatorLexerStaticData(CalculatorLexerStaticData&&) = delete;
  CalculatorLexerStaticData& operator=(const CalculatorLexerStaticData&) = delete;
  CalculatorLexerStaticData& operator=(CalculatorLexerStaticData&&) = delete;

  std::vector<antlr4::dfa::DFA> decisionToDFA;
  antlr4::atn::PredictionContextCache sharedContextCache;
  const std::vector<std::string> ruleNames;
  const std::vector<std::string> channelNames;
  const std::vector<std::string> modeNames;
  const std::vector<std::string> literalNames;
  const std::vector<std::string> symbolicNames;
  const antlr4::dfa::Vocabulary vocabulary;
  antlr4::atn::SerializedATNView serializedATN;
  std::unique_ptr<antlr4::atn::ATN> atn;
};

std::once_flag calculatorlexerLexerOnceFlag;
CalculatorLexerStaticData *calculatorlexerLexerStaticData = nullptr;

void calculatorlexerLexerInitialize() {
  assert(calculatorlexerLexerStaticData == nullptr);
  auto staticData = std::make_unique<CalculatorLexerStaticData>(
    std::vector<std::string>{
      "ASSIGN", "DIVIDE", "EQUAL", "GREATER", "LESS", "MINUS", "MULTIPLY", 
      "NOT", "PLUS", "UNEQUAL", "LPAR", "RPAR", "SEMICOLON", "FALSE", "TRUE", 
      "INTEGER", "VARIABLE", "WS"
    },
    std::vector<std::string>{
      "DEFAULT_TOKEN_CHANNEL", "HIDDEN"
    },
    std::vector<std::string>{
      "DEFAULT_MODE"
    },
    std::vector<std::string>{
      "", "':='", "'/'", "'='", "'>'", "'<'", "'-'", "'*'", "'~'", "'+'", 
      "'~='", "'('", "')'", "';'", "'false'", "'true'"
    },
    std::vector<std::string>{
      "", "ASSIGN", "DIVIDE", "EQUAL", "GREATER", "LESS", "MINUS", "MULTIPLY", 
      "NOT", "PLUS", "UNEQUAL", "LPAR", "RPAR", "SEMICOLON", "FALSE", "TRUE", 
      "INTEGER", "VARIABLE", "WS"
    }
  );
  static const int32_t serializedATNSegment[] = {
  	4,0,18,93,6,-1,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,
  	6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,12,2,13,7,13,2,14,
  	7,14,2,15,7,15,2,16,7,16,2,17,7,17,1,0,1,0,1,0,1,1,1,1,1,2,1,2,1,3,1,
  	3,1,4,1,4,1,5,1,5,1,6,1,6,1,7,1,7,1,8,1,8,1,9,1,9,1,9,1,10,1,10,1,11,
  	1,11,1,12,1,12,1,13,1,13,1,13,1,13,1,13,1,13,1,14,1,14,1,14,1,14,1,14,
  	1,15,4,15,78,8,15,11,15,12,15,79,1,16,4,16,83,8,16,11,16,12,16,84,1,17,
  	4,17,88,8,17,11,17,12,17,89,1,17,1,17,0,0,18,1,1,3,2,5,3,7,4,9,5,11,6,
  	13,7,15,8,17,9,19,10,21,11,23,12,25,13,27,14,29,15,31,16,33,17,35,18,
  	1,0,3,1,0,48,57,2,0,65,90,97,122,3,0,9,10,13,13,32,32,95,0,1,1,0,0,0,
  	0,3,1,0,0,0,0,5,1,0,0,0,0,7,1,0,0,0,0,9,1,0,0,0,0,11,1,0,0,0,0,13,1,0,
  	0,0,0,15,1,0,0,0,0,17,1,0,0,0,0,19,1,0,0,0,0,21,1,0,0,0,0,23,1,0,0,0,
  	0,25,1,0,0,0,0,27,1,0,0,0,0,29,1,0,0,0,0,31,1,0,0,0,0,33,1,0,0,0,0,35,
  	1,0,0,0,1,37,1,0,0,0,3,40,1,0,0,0,5,42,1,0,0,0,7,44,1,0,0,0,9,46,1,0,
  	0,0,11,48,1,0,0,0,13,50,1,0,0,0,15,52,1,0,0,0,17,54,1,0,0,0,19,56,1,0,
  	0,0,21,59,1,0,0,0,23,61,1,0,0,0,25,63,1,0,0,0,27,65,1,0,0,0,29,71,1,0,
  	0,0,31,77,1,0,0,0,33,82,1,0,0,0,35,87,1,0,0,0,37,38,5,58,0,0,38,39,5,
  	61,0,0,39,2,1,0,0,0,40,41,5,47,0,0,41,4,1,0,0,0,42,43,5,61,0,0,43,6,1,
  	0,0,0,44,45,5,62,0,0,45,8,1,0,0,0,46,47,5,60,0,0,47,10,1,0,0,0,48,49,
  	5,45,0,0,49,12,1,0,0,0,50,51,5,42,0,0,51,14,1,0,0,0,52,53,5,126,0,0,53,
  	16,1,0,0,0,54,55,5,43,0,0,55,18,1,0,0,0,56,57,5,126,0,0,57,58,5,61,0,
  	0,58,20,1,0,0,0,59,60,5,40,0,0,60,22,1,0,0,0,61,62,5,41,0,0,62,24,1,0,
  	0,0,63,64,5,59,0,0,64,26,1,0,0,0,65,66,5,102,0,0,66,67,5,97,0,0,67,68,
  	5,108,0,0,68,69,5,115,0,0,69,70,5,101,0,0,70,28,1,0,0,0,71,72,5,116,0,
  	0,72,73,5,114,0,0,73,74,5,117,0,0,74,75,5,101,0,0,75,30,1,0,0,0,76,78,
  	7,0,0,0,77,76,1,0,0,0,78,79,1,0,0,0,79,77,1,0,0,0,79,80,1,0,0,0,80,32,
  	1,0,0,0,81,83,7,1,0,0,82,81,1,0,0,0,83,84,1,0,0,0,84,82,1,0,0,0,84,85,
  	1,0,0,0,85,34,1,0,0,0,86,88,7,2,0,0,87,86,1,0,0,0,88,89,1,0,0,0,89,87,
  	1,0,0,0,89,90,1,0,0,0,90,91,1,0,0,0,91,92,6,17,0,0,92,36,1,0,0,0,4,0,
  	79,84,89,1,6,0,0
  };
  staticData->serializedATN = antlr4::atn::SerializedATNView(serializedATNSegment, sizeof(serializedATNSegment) / sizeof(serializedATNSegment[0]));

  antlr4::atn::ATNDeserializer deserializer;
  staticData->atn = deserializer.deserialize(staticData->serializedATN);

  const size_t count = staticData->atn->getNumberOfDecisions();
  staticData->decisionToDFA.reserve(count);
  for (size_t i = 0; i < count; i++) { 
    staticData->decisionToDFA.emplace_back(staticData->atn->getDecisionState(i), i);
  }
  calculatorlexerLexerStaticData = staticData.release();
}

}

CalculatorLexer::CalculatorLexer(CharStream *input) : Lexer(input) {
  CalculatorLexer::initialize();
  _interpreter = new atn::LexerATNSimulator(this, *calculatorlexerLexerStaticData->atn, calculatorlexerLexerStaticData->decisionToDFA, calculatorlexerLexerStaticData->sharedContextCache);
}

CalculatorLexer::~CalculatorLexer() {
  delete _interpreter;
}

std::string CalculatorLexer::getGrammarFileName() const {
  return "Calculator.g4";
}

const std::vector<std::string>& CalculatorLexer::getRuleNames() const {
  return calculatorlexerLexerStaticData->ruleNames;
}

const std::vector<std::string>& CalculatorLexer::getChannelNames() const {
  return calculatorlexerLexerStaticData->channelNames;
}

const std::vector<std::string>& CalculatorLexer::getModeNames() const {
  return calculatorlexerLexerStaticData->modeNames;
}

const dfa::Vocabulary& CalculatorLexer::getVocabulary() const {
  return calculatorlexerLexerStaticData->vocabulary;
}

antlr4::atn::SerializedATNView CalculatorLexer::getSerializedATN() const {
  return calculatorlexerLexerStaticData->serializedATN;
}

const atn::ATN& CalculatorLexer::getATN() const {
  return *calculatorlexerLexerStaticData->atn;
}




void CalculatorLexer::initialize() {
  std::call_once(calculatorlexerLexerOnceFlag, calculatorlexerLexerInitialize);
}
