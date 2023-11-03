{ pkgs ? import <nixpkgs> {} }:

pkgs.mkShell {
    buldInputs = [ pkgs.openjdk11 ];
}