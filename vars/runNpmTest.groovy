#!/usr/bin/env groovy

def call() {
    sh 'node -v'
    sh 'npm test'
}