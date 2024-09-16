import _import from "eslint-plugin-import";
import jsdoc from "eslint-plugin-jsdoc";
import preferArrow from "eslint-plugin-prefer-arrow";
import typescriptEslint from "@typescript-eslint/eslint-plugin";
import angularEslint from "@angular-eslint/eslint-plugin";
import {fixupPluginRules} from "@eslint/compat";
import globals from "globals";
import tsParser from "@typescript-eslint/parser";
import path from "node:path";
import {fileURLToPath} from "node:url";
import js from "@eslint/js";
import {FlatCompat} from "@eslint/eslintrc";

const __filename = fileURLToPath(import.meta.url);
const __dirname  = path.dirname(__filename);
const compat     = new FlatCompat({
	baseDirectory:     __dirname,
	recommendedConfig: js.configs.recommended,
	allConfig:         js.configs.all
});

export default [
	...compat.extends(
		"plugin:@typescript-eslint/recommended",
		"plugin:@typescript-eslint/recommended-requiring-type-checking",
		"prettier",
	), {
		plugins: {
			import:               fixupPluginRules(_import),
			jsdoc,
			"prefer-arrow":       preferArrow,
			"@typescript-eslint": typescriptEslint,
			"@angular-eslint":    angularEslint,
		},

		languageOptions: {
			globals: {
				...globals.browser,
				...globals.node,
			},

			parser:      tsParser,
			ecmaVersion: 5,
			sourceType:  "module",

			parserOptions: {
				project: "tsconfig.json",
			},
		},

		rules: {
			"arrow-body-style":  ["error", "always"],
			"brace-style":       ["error", "1tbs"],
			camelcase:           "error",
			complexity:          "off",
			"constructor-super": "error",
			curly:               "error",
			"eol-last":          "error",
			eqeqeq:              ["error", "always"],
			"guard-for-in":      "error",

			"id-blacklist": [
				"error",
				"any",
				"Number",
				"number",
				"String",
				"string",
				"Boolean",
				"boolean",
				"Undefined",
				"undefined",
			],

			"id-match":              "error",
			"import/no-deprecated":  "warn",
			"jsdoc/check-alignment": "error",

			"jsdoc/check-indentation": [
				"error", {
					excludeTags: ["param", "returns"],
				}
			],

			"jsdoc/no-undefined-types": 1,
			"max-classes-per-file":     ["error", 1],

			"max-len": [
				"error", {
					code: 80,
				}
			],

			"new-parens":     "error",
			"no-bitwise":     "off",
			"no-caller":      "error",
			"no-cond-assign": "off",

			"no-console": [
				"warn", {
					allow: [
						"warn",
						"dir",
						"timeLog",
						"assert",
						"clear",
						"count",
						"countReset",
						"group",
						"groupEnd",
						"table",
						"dirxml",
						"error",
						"groupCollapsed",
						"Console",
						"profile",
						"profileEnd",
						"timeStamp",
						"context",
					],
				}
			],

			"no-debugger":     "error",
			"no-empty":        "error",
			"no-eval":         "error",
			"no-fallthrough":  "error",
			"no-invalid-this": "warn",

			"no-multiple-empty-lines": [
				"error", {
					max: 2,
				}
			],

			"no-new-wrappers":       "error",
			"no-restricted-imports": ["error", "rxjs", "rxjs/Rx", "lodash"],

			"no-shadow": [
				"error", {
					hoist: "all",
				}
			],

			"no-throw-literal":                    "error",
			"no-trailing-spaces":                  "error",
			"no-undef-init":                       "error",
			"no-underscore-dangle":                "error",
			"no-unsafe-finally":                   "error",
			"no-unused-labels":                    "off",
			"object-shorthand":                    "error",
			"one-var":                             ["error", "never"],
			"prefer-arrow/prefer-arrow-functions": "error",
			radix:                                 "error",

			"spaced-comment": [
				"error", "always", {
					markers: ["/"],
				}
			],

			"use-isnan":    "error",
			"valid-typeof": "error",

			"@typescript-eslint/array-type": [
				"error", {
					default: "array",
				}
			],

			"@typescript-eslint/no-restricted-types": [
				"error", {
					types: {
						Object: {
							message: "Avoid using the `Object` type. Did you mean `object`?",
						},

						Function: {
							message: "Avoid using the `Function` type. Prefer a specific function type, like `() => void`.",
						},

						Boolean: {
							message: "Avoid using the `Boolean` type. Did you mean `boolean`?",
						},

						Number: {
							message: "Avoid using the `Number` type. Did you mean `number`?",
						},

						String: {
							message: "Avoid using the `String` type. Did you mean `string`?",
						},

						Symbol: {
							message: "Avoid using the `Symbol` type. Did you mean `symbol`?",
						},
					},
				}
			],

			"@typescript-eslint/consistent-type-definitions": "error",
			"@typescript-eslint/dot-notation":                "off",

			"@typescript-eslint/explicit-member-accessibility": [
				"error", {
					accessibility: "explicit",

					overrides: {
						accessors:           "explicit",
						constructors:        "explicit",
						parameterProperties: "explicit",
					},
				}
			],

			"@typescript-eslint/interface-name-prefix":   "off",
			"@typescript-eslint/member-ordering":         "error",
			"@typescript-eslint/no-explicit-any":         "off",
			"@typescript-eslint/no-non-null-assertion":   "error",
			"@typescript-eslint/no-parameter-properties": "off",
			"@typescript-eslint/no-unused-expressions":   "error",
			"@typescript-eslint/prefer-for-of":           "error",
			"@typescript-eslint/prefer-function-type":    "error",

			"@typescript-eslint/triple-slash-reference": [
				"error", {
					path:  "always",
					types: "prefer-import",
					lib:   "always",
				}
			],

			"@typescript-eslint/unified-signatures":        "error",
			"@angular-eslint/component-class-suffix":       "error",
			"@angular-eslint/directive-class-suffix":       "error",
			"@angular-eslint/no-input-rename":              "off",
			"@angular-eslint/no-output-on-prefix":          "error",
			"@angular-eslint/no-output-rename":             "off",
			"@angular-eslint/use-pipe-transform-interface": "error",
		},
	}
];
