#!/usr/bin/env groovy

def call(String foo) {
    sh 'node -v'
    sh 'npm test'
}