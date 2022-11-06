
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
      "ANY"
    },
    std::vector<std::string>{
      "DEFAULT_TOKEN_CHANNEL", "HIDDEN"
    },
    std::vector<std::string>{
      "DEFAULT_MODE"
    },
    std::vector<std::string>{
    },
    std::vector<std::string>{
      "", "ANY"
    }
  );
  static const int32_t serializedATNSegment[] = {
  	4,0,1,9,6,-1,2,0,7,0,1,0,5,0,5,8,0,10,0,12,0,8,9,0,0,0,1,1,1,1,0,1,1,
  	0,97,122,9,0,1,1,0,0,0,1,6,1,0,0,0,3,5,7,0,0,0,4,3,1,0,0,0,5,8,1,0,0,
  	0,6,4,1,0,0,0,6,7,1,0,0,0,7,2,1,0,0,0,8,6,1,0,0,0,2,0,6,0
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
